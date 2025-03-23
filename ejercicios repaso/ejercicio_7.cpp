#include <iostream>
#include <vector>
using namespace std;

const int cantCarreras = 24;
const int cantEquipos = 10;
const int cantPilotos = 20;

struct Piloto{
    string nombre;
    int numAuto;
    string equipo;
    int pos_arranque;
    int pos_final;
    int cantPuntos; /* 10 primeros suman */
    bool obtuvo_vueltaRapida;
};

struct Vuelta_rapida {
    int numero_vuelta;
    int tiempo;
    string nombre_piloto;
};
  
struct Equipo {
    string nombre;
    int puntos;
};

const vector<int> puntajes = {25,18,15,12,10,8,6,4,2,1};

void cargar_datos_carrera(vector<Piloto> &pilotos){
    for(int i = 0; i < cantPilotos ; i++) {
        Piloto piloto;
        cout << "cargar piloto con posicion " << i + 1 << ": ";
        cin >> pilotos[i].nombre;
        cin >> pilotos[i].numAuto;
        cin >> pilotos[i].equipo;
        cin >> pilotos[i].pos_arranque;
        pilotos[i].pos_final = i + 1;
        cin >> pilotos[i].obtuvo_vueltaRapida; 
    }
}

void calcular_puntaje_piloto_equipo (vector<Piloto> &pilotos, vector<Equipo> &equipos){
    for(int i = 0; i < 10 /* solo los 10 primeros */ ; i++) {
        pilotos[i].cantPuntos = puntajes[i];
        if (pilotos[i].obtuvo_vueltaRapida){
            pilotos[i].cantPuntos += 1;
        }  

        for(Equipo equipo : equipos){
            if(equipo.nombre == pilotos[i].equipo){
                equipo.puntos += pilotos[i].cantPuntos;
            }
        }
    }
}

void ordenar_tabla_equipos(vector<Equipo> &equipos){
    for (int i = 0; i < cantEquipos - 1; i++) {
        for (int j = 0; j < cantEquipos - i - 1; j++) {
            if (equipos[j].puntos < equipos[j + 1].puntos) {
                Equipo aux = equipos[j];
                equipos[j] = equipos[j + 1];
                equipos[j + 1] = aux;
            }
        }
    }
}

void mostrar_tabla_equipos(vector<Equipo> equipos) {
    cout << "Tabla de posiciones final: " << endl;
    for (int i = 0; i < cantEquipos; i++) {
        cout << i + 1 << "). " << equipos[i].nombre << " - " << equipos[i].puntos << " puntos";
    }
}

int main(){
    vector<Equipo> equipos = {
        {"Mercedes", 0}, {"RedBull", 0}, {"Ferrari", 0}, {"McLaren", 0}, {"Aston Martin", 0},
        {"Alpine", 0}, {"Haas", 0}, {"Williams", 0}, {"AlphaTauri", 0}, {"Alfa Romeo", 0}
    };
    vector<Piloto> pilotos(cantPilotos);
    
    for (int i = 0; i < cantCarreras; i++){
       cargar_datos_carrera(pilotos);
       calcular_puntaje_piloto_equipo(pilotos, equipos);
    }

    ordenar_tabla_equipos(equipos);
    mostrar_tabla_equipos(equipos);
}
