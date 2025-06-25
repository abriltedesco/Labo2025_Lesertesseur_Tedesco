package bebidas;

public abstract class Bebida {
    private String nombre;
    private static int coeficientePositividad;
    private int coeficienteNegatividad;
    private Tipo tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Bebida(String nombre, int coeficienteNegatividad, Tipo tipo) {
        this.nombre = nombre;
        this.coeficienteNegatividad = coeficienteNegatividad;
        this.tipo = tipo;
    }

    abstract void calcularCoeficiente ();
}
