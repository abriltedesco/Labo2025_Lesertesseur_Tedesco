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
    for(int i=0 ; i<3 ; i++){
        Empleado empleado;
        cout<<"Ingreso de datos"<<endl;
        cin>>empleado.nombre;
        cin>>empleado.apellido;
        cin>>empleado.fecha.dia;
        cin>>empleado.fecha.mes;
        cin>>empleado.fecha.anio;
        cin>>empleado.sexo;
        cin>>empleado.salario;
        empleados.push_back(empleado);
    }
}

Empleado ordenarVector(vector<Empleado> &empleados){
    for (int i = 1; i < empleados.size(); ++i) {
        float key = empleados[i].salario;
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
            eMenorSalario.push_back(e);
        }
    }

    return ordenarVector(empleados);

}

int main(){
    vector<Empleado> empleados;
    vector<Empleado> eMenorSalario;
    crearEmpleados(empleados);

    cout << "Empleado con mayor sueldo: " << endl ;
    Empleado emp = empleadoConMayorSueldo(empleados, eMenorSalario);
    cout << emp.nombre << " " <<emp.apellido << " su sueldo es: " << emp.salario << endl;

    cout << "Empleados con menor sueldo: " <<endl;
    for (Empleado e: eMenorSalario){
        cout << e.nombre << " " << e.apellido << endl;
    }
}

