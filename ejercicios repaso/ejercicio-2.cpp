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

    const int fila = 3;
    const int columna = 4;

int columnaMayorValor(Producto_t gondolas[3][4]){
    int columnaMayor=0;
    int mayorPrecio=0;
    int totalColumnas=0;

    for (int j = 0; j < columna; j++){
        for(int i = 0 ; i < fila ; i++){
            totalColumnas += gondolas[i][j].precio;
            }
        if(totalColumnas > mayorPrecio){
            mayorPrecio = totalColumnas;
            columnaMayor = j;
        }
        totalColumnas = 0;
    }

    return columnaMayor++;
}

float promedioPrecios(Producto_t gondolas[3][4]){
    float suma = 0;
    float promedio;


    for(int i=0; i < fila; i++){
        for(int j=0; j < columna; j++){
            suma += gondolas[i][j].precio;
        }
    }

    promedio = suma / (fila * columna);

}

int cantFechaVencimiento(Producto_t gondolas[3][4]){
    int contador=0;    
        
    for(int i=0; i < 3; i++){
        for(int j=0; j < 4; j++){
        
        if(gondolas[i][j].vencimiento){
            contador++;
                    }
        }
    }

    return contador;

}

int main(){
    //3 filas 4 columnas
    Producto_t gondolas[3][4]; //matriz
    for(int i=0; i < 3; i++){
        for(int j=0; j < 4; j++){
            // creamos productos
            cout<<"Ingreso de productos"<<endl;
            cin>>gondolas[i][j].nombre;
            cin>>gondolas[i][j].codBarra;
            cin>>gondolas[i][j].precio;
            cin>>gondolas[i][j].marca;
            cin>>gondolas[i][j].vencimiento;
        }
    }

    int cmv = columnaMayorValor(gondolas);
    cout << "Producto de mayor valor: " << cmv ;

    cout << "Nombre producto [2][3]: ";
    cout << gondolas[2][3].nombre;

    float p = promedioPrecios(gondolas);
    cout << "Promedio de precio de pasillo: " << p;

    float c = cantFechaVencimiento(gondolas);
    cout << "Cantidad de productos con fecha de vencimiento: " << c;

}
