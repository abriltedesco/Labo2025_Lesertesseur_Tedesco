#include <iostream>
#include <vector>
using namespace std; 

struct Producto_t{
    
    string nombre;
    int codBarra;
    float precio;
    string marca;
    bool vencimiento;

};
void crearProductos (){
    for(int i=0 ; i<12 ; i++){
        Producto_t producto;
        cout<<"Ingreso de datos"<<endl;
        cin>>producto.nombre;
        cin>>producto.codBarra;
        cin>>producto.precio;
        cin>>producto.marca;
        cin>>producto.vencimiento;
        productos.push_back(producto);
    }
}

int main(){
    //3 filas 4 columnas
    Producto_t gondolas[3][4]; //matriz
    



}