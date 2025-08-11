package control;

public class Registro {
    private float altura;
    private float peso;

    public Registro(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }
    public Registro() {
        this.altura = 1.67f;
        this.peso = 67f;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
