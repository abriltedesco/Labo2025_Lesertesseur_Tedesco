#include <iostream>
#include <vector> 
using namespace std; 

// ej 8 - O(n1+n2)
vector<int> ordenado(vector<int> v1, vector<int> v2) {
    vector<int> ordenado;
    int i = 0, j = 0; 

    while (i < v1.size() && j < v2.size()) {
        if (v1[i] < v2[j]) {
            ordenado.push_back(v1[i]);
            i++; 
        } else {
            ordenado.push_back(v2[j]);
            j++; 
        }
    }

    while (i < v1.size()) { ordenado.push_back(v1[i]);  i++; }
    while (j < v2.size()) { ordenado.push_back(v2[j]);  j++; }

    return ordenado;
}

// ej 9 - O(n1+n2+n3)
vector<int> elemComun(vector<int> v1, vector<int> v2, vector<int> v3) {
    int i = 0, j = 0, k = 0;

    while (i < v1.size() && j < v2.size() && k < v3.size()) {
        if (v1[i] == v2[j] && v2[j] == v3[k]) {
            return {i, j, k};
        }

        if (v1[i] <= v2[j] && v1[i] <= v3[k]) {
            i++;
        } else if (v2[j] <= v1[i] && v2[j] <= v3[k]) {
            j++;
        } else {
            k++;
        }
    }
    
    return null;
}

// ej 10 - O(n)
void ordenar(vector<int> &v) {
    int cant1 = 0, cant2 = 0, cant3 = 0;

    for (int i = 0; i < v.size(); i++) {
        if (v[i] == 1) { cant1++; } 
        else if (v[i] == 2) { cant2++; } 
        else { cant3++; }
    }

    int k = 0;
    for (int i = 0; i < cant1; i++) { v[k] = 1;  k++; }
    for (int i = 0; i < cant2; i++) { v[k] = 2;  k++; }
    for (int i = 0; i < cant3; i++) { v[k] = 3;  k++; }
}

// ej 11 - O(M) = O(n)
// en java lo haria con hashmap donde la clave es el numero y el valor la cantidad de apariciones
int masFrecuente(vector<int> v) {
    int M = v.size(); 
    vector<int> frecuencias(M + 1, 0); // largo del v = M y q inice todo en cant=0


    for (int i = 0; i < M; i++) { frecuencias[v[i]]++;  }

    int numMasFrecuente = 0;
    int maxFrec = 0;
    for (int j = 0; j <= M; j++) {
        if (frecuencias[j] > maxFrec) {
            maxFrec = frecuencias[j];
            numMasFrecuente = j;
        }
    }

    return numMasFrecuente;
}