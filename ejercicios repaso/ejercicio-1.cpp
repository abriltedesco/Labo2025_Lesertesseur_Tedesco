#include <iostream>
#include <vector>
using namespace std; 

struct Fecha{
    int dia; 
    int mes; 
    int anio;
};

struct Empleado{
    string nombre;
    string apellido;
    Fecha fecha;
    string sexo;
    float salario;
};

void crearEmpleados (vector<Empleado> &empleados){
    for(int i=0 ; i<10 ; i++){
        Empleado empleado;
        cout<<"Ingreso de datos"<<endl;
        cin>>empleado.nombre;
        cin>>empleado.apellido;
        cin>>empleado.fecha.dia;
        cin>>empleado.fecha.mes;
        cin>>empleado.fecha.anio;
        cin>>empleado.sexo;
        cin>>empleado.salario;
        empleados.push_back(empleado)

        // cin>>empleados[i].nombre;
        // cin>>empleados[i].apellido;
        // cin>>empleados[i].fecha.dia;
        // cin>>empleados[i].fecha.mes;
        // cin>>empleados[i].fecha.anio;
        // cin>>empleados[i].sexo;
        // cin>>empleados[i].salario;
    }
}

Empleado ordenarVector(vector<Empleado> &empleados){
    for (int i = 1; i < empleados.size(); ++i) {
        int key = empleados[i].salario;
        int j = i - 1;
        while (j >= 0 && empleados[j].salario > key) {
            empleados[j + 1].salario = empleados[j].salario;
            j = j - 1;
        }
        empleados[j + 1].salario = key;
    }

    int tamanio;
    tamanio = empleados.size();
    Empleado mayor;
    mayor = empleados[tamanio - 1] ;

    return mayor;
}

Empleado empleadoConMayorSueldo (vector<Empleado> &empleados, vector<Empleado> &eMenorSalario){
    for(Empleado e: empleados){
        if(e.salario <= 400000){
            vector <Empleado> eMenorSalario;
            eMenorSalario.push_back(e);
            cout<< e.nombre << endl;
            cout<< e.apellido << endl;
            cout<< e.sexo << endl;
            cout<< e.salario << endl; 
        }
        else{
            return ordenarVector(empleados);
        }
    }
}



int main(){
    // Empleado empleado;
    vector<Empleado> empleados;
    vector<Empleado> eMenorSalario;
    crearEmpleados(empleados);

    cout << "Empleado con mayor sueldo: " ;
    Empleado emp = empleadoConMayorSueldo(empleados, eMenorSalario);
    cout << emp.nombre << " " <<emp.apellido << " su suedo es: " << emp.salario;

    cout << "Empleados con menor sueldo: " <<endl;
    for (Empleado e: eMenorSalario){
        cout << e.nombre << " " << e.apellido;
    }
}
