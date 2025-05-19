package colegio;

import personas.Persona;

public class Profesor extends Persona {
    private double porcentajeDescuento;

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Profesor(String nombre, String apellido, double porcentajeDescuento) {
        super(nombre, apellido);
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
