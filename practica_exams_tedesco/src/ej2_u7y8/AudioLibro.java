package ej2_u7y8;

public class AudioLibro extends Publicacion {
    private int duracionMin;
    private int peso;

    public AudioLibro(String titulo, String autor, int anioPublicacion, int stock, int duracionMin, int peso) {
        super(titulo, autor, anioPublicacion, stock);
        this.duracionMin = duracionMin;
        this.peso = peso;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
