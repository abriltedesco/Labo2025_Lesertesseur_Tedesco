#include <iostream>
#include <vector> 
using namespace std; 

struct Producto_t {
    string nombre;
    float precio;
};

struct Pedido_t{
    int numPedido;
    string nombreCliente, estado;
    float precioTotal;
    vector<Producto_t>vector_productos;//cantidad de productos por pedido
};

void crearPedido(Pedido_t &pedido, vector<Pedido_t> &vector_pedidos){
    cout << "num pedido: " ;
    cin >> pedido.numPedido ;
    cout << "nombre cliente: " ;
    cin >> pedido.nombreCliente;
    cout << "cuantos productos tiene? " << endl;
    int cant = 0;
    cin >> cant;
    for (int i = 0; i < cant ; i++ ){
        cout << "producto" << i+1;
        Producto_t producto;
        cin >> producto.nombre;
        cin >> producto.precio;
        pedido.vector_productos.push_back(producto);
    }
    cout << "estado: " ;
    cin >> pedido.estado;
    vector_pedidos.push_back(pedido);
}

void cancelarPedido(vector<Pedido_t> & vector_pedidos){
    int numpedido;
    cout << "ingresar num de pedido a cancelar: ";
    cin >> numpedido;
    for(int i = 0 ; i < vector_pedidos.size() ; i++){
        if (numpedido == vector_pedidos[i].numPedido){
            vector_pedidos[i].estado = "cancelado";
        }
    }
}

void mostrarPedido(vector<Pedido_t> vector_pedidos){

    for(int i=0 ; i < vector_pedidos.size() ; i++ ){
        cout << "PEDIDO " << i + 1 << endl;
        cout << "num: " << vector_pedidos[i].numPedido << endl;
        cout << "nombre: " << vector_pedidos[i].nombreCliente << endl;
        cout << "estado: " << vector_pedidos[i].estado << endl;

        for(int j = 0 ; j < vector_pedidos[i].vector_productos.size() ; j++){
            cout << "- producto " << j + 1 << endl;
            cout << vector_pedidos[i].vector_productos[j].nombre << endl;
            cout << vector_pedidos[i].vector_productos[j].precio << endl;
        }

        cout << " -------------------------- " <<endl;
    }
}

float ingresoTotal(vector<Pedido_t> vector_pedidos){
    float totalIngreso=0;
    for (int i = 0; i < vector_pedidos.size() ; i++ ){
        if(vector_pedidos[i].estado == "completado"){
            for (int j = 0; j < vector_pedidos[i].vector_productos.size() ; j++ ){
                totalIngreso += vector_pedidos[i].vector_productos[j].precio;
            }   
    }
    }
            return totalIngreso;
}

int main (){
    Pedido_t pedido;
    vector<Pedido_t> vector_pedidos;
    int opcion = 0;
    bool menu = true;

    while(menu){
        cout << "Elegir opcion: " << endl;
        cout << "1 - crear pedido " << endl;
        cout << "2 - cancelar pedido " << endl;
        cout << "3 - mostrar pedido " << endl;
        cout << "4 - ingreso total " << endl;
        cout << "5 - salir del menu "<< endl;
        cin >> opcion;

        switch (opcion){
            case 1: 
                crearPedido(pedido, vector_pedidos);
                break;
            case 2:
                cancelarPedido(vector_pedidos);
                break;
            case 3: 
                mostrarPedido(vector_pedidos);
                break;
            case 4:    
                cout << "ingreso total es: " <<  ingresoTotal(vector_pedidos);
                break;
            case 5:
                menu = false;
                break;
            default:
                cout << "Ingrese la opción" << endl ;
                break;
        }

    }
}