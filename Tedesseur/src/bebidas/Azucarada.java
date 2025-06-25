package bebidas;

public class Azucarada extends Bebida{
    private int cantAzucar;

    public Azucarada(String nombre, int coeficienteNegatividad, Tipo tipo, int cantAzucar) {
        super(nombre, coeficienteNegatividad, tipo);
        this.setCoeficientePositividad(1);
        this.cantAzucar = cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public void calcularCoeficiente(){
        setCoeficienteNegatividad(this.getCantAzucar() * 10);
    }
}
