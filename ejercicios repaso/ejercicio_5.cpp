#include <iostream>
#include <vector>
using namespace std;

struct Fecha_t{
    int dia;
    int mes;
    int anio;
};

struct Pedido_t{
    string nombreCliente;
    int totalProductos;
    Fecha_t fechaPedido;
    float precioTotal;
};

struct Producto_t {
    string nombre;
    bool promocion; //para poder ingresar un valor booleano, hay que poner 0 o 1
    int cantVentas;
    float precio;
    string categoria;
};



void mostrarVectorProductos(vector<Producto_t> &vectorProductos){

    cout << "------------------------" << endl;

    for(int i = 0 ; i < vectorProductos.size() ; i++){
        cout << "Nombre: " << vectorProductos[i].nombre << endl;
        cout << "------------------------" << endl;
        cout << "Promoción: " <<vectorProductos[i].promocion << endl;
        cout << "------------------------" << endl;
        cout << "Cantidad de ventas: " <<vectorProductos[i].cantVentas << endl;
        cout << "------------------------" << endl;
        cout << "Precio: " <<vectorProductos[i].precio << endl;
        cout << "------------------------" << endl;
        cout << "Categoría: " <<vectorProductos[i].categoria<< endl;
        cout << "------------------------" << endl;
    }
    //la funcion de mostrar vector solo muestra el último producto ingresado
}

void buscarPedido(vector<Producto_t> &vectorProductos){         

//El usuario deberá poder consultar un pedido específico por el nombre del cliente. 
//Mostrando por pantalla la información del pedido.
    Pedido_t aux;
    string nombreCliente;
    cout<<"Búsqueda por nombre de cliente"<<endl;
    cin>>nombreCliente;

    for(int i = 0 ; i < vectorProductos.size() ; i++){
        if(nombreCliente == aux.nombreCliente){
            mostrarVectorProductos(vectorProductos);
        }
    }
}


Producto_t ingresoProductos(vector<Producto_t> &vectorProductos) {
    cout << "Comienza el ingreso de productos" << endl;
    Producto_t aux;
    Pedido_t auxPedido;
    float precioTotal=0;
    int contador=0;
    
    while (contador<3){ //cambiar contador mas tarde para el ingreso de 20 productos (chequear consigna)    
       
       cout<< "Ingreso nombre" << endl;
        cin >> aux.nombre;  
        cout<< "Ingreso promocion" << endl;
        cin>>aux.promocion;
        cout<< "Ingreso cantidad de ventas" << endl;
        cin>>aux.cantVentas;
        cout<< "Ingreso precio" << endl;
        cin>>aux.precio;
        precioTotal += aux.precio;
        cout<< "Ingreso categoria" << endl;
        cin>>aux.categoria;

        contador++;  
        
    }
    
    vectorProductos.push_back(aux);
    //precio total funciona bien, pero no usa la variable de pedido_t
    cout<< "Precio total: " <<precioTotal << endl;
    mostrarVectorProductos(vectorProductos);
    
    return aux;
}


int main(){
    vector<Producto_t> vectorProductos;

    cout << "Funcion 'IngresoProductos' " << endl;
    ingresoProductos(vectorProductos);
   
   //funcion registrar pedido 
   
    cout << "Funcion 'buscarPedido' " << endl;
    buscarPedido(vectorProductos);
}