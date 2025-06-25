package bebidas;

public class Alcohol extends Bebida{
    private int cantAlcohol;

    public Alcohol(String nombre, int coeficientePositividad, int coeficienteNegatividad, Tipo tipo, int cantAlcohol) {
        super(nombre, coeficienteNegatividad, tipo);
        this.setCoeficientePositividad(0);
        this.cantAlcohol = cantAlcohol;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    public void calcularCoeficiente(){
        setCoeficienteNegatividad(this.getCantAlcohol() * 20);
    }



}
