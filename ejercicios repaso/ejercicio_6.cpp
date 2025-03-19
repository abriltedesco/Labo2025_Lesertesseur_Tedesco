#include <iostream>
#include <vector>
using namespace std;

struct Jugador {
    string nombre;
    bool es_arquero = false;
};

struct Resultado {
    char resultado;
    int valor;
};

struct Equipo {
    string nombre;
    int posicion = 0, goles_a_favor = 0, goles_en_contra = 0;
    vector<Resultado> historial;
    Jugador jugadores[11];  
};

struct Fecha {
    int dia, mes, anio;
};

struct Partido {
    Fecha fecha;
    string local, visitante, estadio;
    int goles_local = 0, goles_visitante = 0;
};

void ingresarEquipo(vector<Equipo> &equipos) {
    Equipo equipo;
    cout << "nombre del equipo: ";
    cin >> equipo.nombre;

    for (int i = 0; i < 11; i++) {
        string respuesta;
        cout << "nombre del jugador " << i + 1 << ": ";
        cin >> equipo.jugadores[i].nombre;
        cout << "es arquero?: ";
        cin >> respuesta;
        if (respuesta == "si" || respuesta == "Si"){
            equipo.jugadores[i].es_arquero = true;
        }
    }

    equipos.push_back(equipo);
}

void registrarPartido(vector<Equipo> &equipos, vector<Partido> &partidos) {
    Partido partido;
    cout << "local: ";
    cin >> partido.local;
    cout << "visitante: ";
    cin >> partido.visitante;
    cout << "goles del local: ";
    cin >> partido.goles_local;
    cout << "goles del visitante: ";
    cin >> partido.goles_visitante;
    cout << "fecha del partido: ";
    cin >> partido.fecha.dia >> partido.fecha.mes >> partido.fecha.anio;
    cout << "estadio: ";
    cin >> partido.estadio;

    partidos.push_back(partido);

    for (Equipo &equipo : equipos) {
        if (equipo.nombre == partido.local) {
            equipo.goles_a_favor += partido.goles_local;
            equipo.goles_en_contra += partido.goles_visitante;
            Resultado resultado;
            if (partido.goles_local > partido.goles_visitante) {
                resultado.resultado = 'V';
                resultado.valor = 3;
            } else if (partido.goles_local == partido.goles_visitante) {
                resultado.resultado = 'E';
                resultado.valor = 1;
            } else {
                resultado.resultado = 'D';
                resultado.valor = 0;
            }
            equipo.historial.push_back(resultado);
            equipo.posicion += resultado.valor;  
        } 
        else if (equipo.nombre == partido.visitante) {
            equipo.goles_a_favor += partido.goles_visitante;
            equipo.goles_en_contra += partido.goles_local;
            Resultado resultado;
            if (partido.goles_visitante > partido.goles_local) {
                resultado.resultado = 'V';
                resultado.valor = 3;
            } else if (partido.goles_local == partido.goles_visitante) {
                resultado.resultado = 'E';
                resultado.valor = 1;
            } else {
                resultado.resultado = 'D';
                resultado.valor = 0;
            }
            equipo.historial.push_back(resultado);
            equipo.posicion += resultado.valor;  
        }
    }
}



void mostrarPartido(vector<Partido> partidos) {
    string equipoL, equipoV;
    int dia, mes;
    cout << "equipo local: ";
    cin >> equipoL;
    cout << "equipo visitante: ";
    cin >> equipoV;
    cout << "fexcha: ";
    cin >> dia;
    cin >> mes;

    for (Partido partido : partidos) {
        if ((partido.local == equipoL && partido.visitante == equipoV) && (partido.fecha.dia == dia && partido.fecha.mes == mes)) {
            cout << "partido: " << partido.local << " (" << partido.goles_local << ") " << "vs " << partido.visitante <<  " (" << partido.goles_visitante << ") " << endl;
            cout << "en el estadio: " << partido.estadio << endl;
        }
    }
}

void ordenarEquipos(vector<Equipo>&equipos) {
    for (int i = 0; i < equipos.size() -1 ; i++) {
        for (int j = 0; j < equipos.size() - i - 1; j++) {
            if (equipos[j].posicion < equipos[j + 1].posicion) {
                Equipo aux = equipos[j];
                equipos[j] = equipos[j + 1];
                equipos[j + 1] = aux;
            }
        }
    }
}

void mostrarTabla(vector<Equipo> equipos) {
    ordenarEquipos(equipos);
    for (Equipo equipo : equipos) {
        cout << equipo.posicion << ") " << equipo.nombre << endl;
        cout << " a favor: " << equipo.goles_a_favor << endl ;
        cout << " en contra: " << equipo.goles_en_contra << endl;
        cout << " historial: ";
                for (Resultado historial : equipo.historial) {
            cout << historial.resultado << "; ";
        }
        cout << endl;
    }
}

int main() {
    vector<Equipo> equipos;
    vector<Partido> partidos;
    int opcion = 0;

    while (opcion != 5) {
        cout << "elegir opcion:" << endl;
        cout << "1. ingresar equipos" << endl;
        cout << "2. registrar partido" << endl;
        cout << "3. mostrar partido" << endl;
        cout << "4. mostrar tabla" << endl;
        cout << "5. salir" << endl;
        cout << "opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                ingresarEquipo(equipos);
                break;
            case 2:
                registrarPartido(equipos, partidos);
                break;
            case 3:
                mostrarPartido(partidos);
                break;
            case 4:
                mostrarTabla(equipos);
                break;
            case 5:
                break;
        }
    }
}
