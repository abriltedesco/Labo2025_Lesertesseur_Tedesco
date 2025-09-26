package ej2_u7y8;

public class Publicacion {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int stock;

    public Publicacion(String titulo, String autor, int anioPublicacion, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean tieneStock(){
        if (stock > 0) {
            return true;
        }
        return false;
    }

    public void reducirStock(){
        if(tieneStock()) {
            this.stock--;
        }
        else{
            System.out.println("no hay stock disponible de la publicacion: " + this.getTitulo());
        }
    }

    public void aumentarStock(){
        this.stock ++ ;
    }
}
