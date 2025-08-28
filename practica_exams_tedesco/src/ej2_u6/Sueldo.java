package ej2_u6;

public class Sueldo {
    private double monto;
    private Banco banco;

    public Sueldo(double monto, Banco banco) {
        this.monto = monto;
        this.banco = banco;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
