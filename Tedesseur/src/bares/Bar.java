package bares;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private int cantClientes;
    private double dineroRecaudado;
    private HashSet<Beneficio> implementados;
    private HashSet<Beneficio> acumulables;

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

    public HashSet<Beneficio> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<Beneficio> acumulables) {
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
}
