#include <iostream>
#include <vector> 
using namespace std; 

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct Paciente_t {
    string nombre, estado_cita;
    int edad, numHistoria;
    Fecha fecha_cita;
};

void registrarPacientes(vector<Paciente_t>&vector_pacientes){
    Paciente_t paciente;
    cin >> paciente.nombre ;
    cin >> paciente.estado_cita ;
    cin >> paciente.edad ;
    cin >> paciente.numHistoria ;
    cin >> paciente.fecha_cita.dia;
    cin >> paciente.fecha_cita.mes;
    cin >> paciente.fecha_cita.anio;
    vector_pacientes.push_back(paciente);
}

void cancelarCita(vector<Paciente_t>&vector_pacientes){
    
    int auxHistoriaClinica;
    cin >> auxHistoriaClinica;

    for(int i =0 ; i < vector_pacientes.size() ; i++){
        if(auxHistoriaClinica ==  vector_pacientes[i].numHistoria){
            vector_pacientes[i].estado_cita = "cancelada";
        }    
    }
}

void mostrarCitas (vector<Paciente_t>vector_pacientes){
    int dia=0;
    int mes=0;
    int anio=0;

    for(int i =0 ; i < vector_pacientes.size() ; i++){
        if(dia ==  vector_pacientes[i].fecha_cita.dia && mes ==  vector_pacientes[i].fecha_cita.mes && anio ==  vector_pacientes[i].fecha_cita.anio){
                cout << vector_pacientes[i].nombre ;
                cout << vector_pacientes[i].estado_cita ;
                cout << vector_pacientes[i].edad ;
                cout << vector_pacientes[i].numHistoria ;
                cout << vector_pacientes[i].fecha_cita.dia;
                cout << vector_pacientes[i].fecha_cita.mes;
                cout << vector_pacientes[i].fecha_cita.anio;
        }
    }
}

void mostrarPaciente (vector<Paciente_t>vector_pacientes){
    int auxHistoriaClinica;
    cin >> auxHistoriaClinica;
    
    for(int i =0 ; i < vector_pacientes.size() ; i++){
        if(auxHistoriaClinica ==  vector_pacientes[i].numHistoria){
                cout << vector_pacientes[i].nombre ;
                cout << vector_pacientes[i].estado_cita ;
                cout << vector_pacientes[i].edad ;
                cout << vector_pacientes[i].numHistoria ;
                cout << vector_pacientes[i].fecha_cita.dia;
                cout << vector_pacientes[i].fecha_cita.mes;
                cout << vector_pacientes[i].fecha_cita.anio;
        }    
    }
}


int main(){
    vector<Paciente_t> vector_pacientes;
    registrarPacientes(vector_pacientes);
    mostrarCitas(vector_pacientes);
    cancelarCita(vector_pacientes);
    mostrarPaciente(vector_pacientes);
}