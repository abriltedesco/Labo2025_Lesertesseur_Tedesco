package bares;

import java.util.HashMap;
import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private int cantClientes;
    private double dineroRecaudado;
    private HashSet<Beneficio> implementados;
    private HashSet<Acumulable> acumulables;

    public Bar(HashSet<Diana> dianas, int cantClientes, double dineroRecaudado, HashSet<Beneficio> implementados, HashSet<Acumulable> acumulables) {
        this.dianas = dianas;
        this.cantClientes = cantClientes;
        this.dineroRecaudado = dineroRecaudado;
        this.implementados = implementados;
        this.acumulables = acumulables;
    }

    public Bar(){
        this.dianas = new HashSet<>();
        this.cantClientes = 101;
        this.dineroRecaudado = 353535.65;
        this.implementados = new HashSet<>();
        this.acumulables = new HashSet<>();
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public HashSet<Acumulable> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<Acumulable> acumulables) {
        this.acumulables = acumulables;
    }

    public HashSet<Beneficio> getImplementados() {
        return implementados;
    }

    public void setImplementados(HashSet<Beneficio> implementados) {
        this.implementados = implementados;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public int cantBeneficiosNoAcumulables(){
        return this.implementados.size() - this.acumulables.size();
    }

    public void agregarDianas(Diana diana){
        this.dianas.add(diana);
    }

    public Diana conMasPuntaje() {
        Diana aux = null;
        for (Diana diana : this.dianas) {
            if (aux == null || diana.getPuntajesPorColor().size() > aux.getPuntajesPorColor().size()) {
                aux = diana;
            }
        }
        return aux;
    }

}
