package biblioteca.actual;

public class LibroVirtual {
    private String titulo;
    private Genero genero;
    private String nombreArchivo;
    private static int descargasTotales = 145;
    private int descargasRealizadas ;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public static int getDescargasTotales() {
        return descargasTotales;
    }

    public static void setDescargasTotales(int descargasTotales) {
        LibroVirtual.descargasTotales = descargasTotales;
    }

    public int getDescargasRealizadas() {
        return descargasRealizadas;
    }

    public void setDescargasRealizadas(int descargasRealizadas) {
        this.descargasRealizadas = descargasRealizadas;
    }

    public LibroVirtual(String titulo, Genero genero, String nombreArchivo, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.nombreArchivo = nombreArchivo;
        this.autor = autor;
        this.descargasRealizadas = 0;
    }

    public int descargasDisponibles(){
        return descargasTotales - descargasRealizadas;
    }

    public void descargarLibro() throws LimiteDePrestamosAlcanzadosExc {
        if(descargasDisponibles() > 0){
            descargasRealizadas++;
        }
        else{
            throw new LimiteDePrestamosAlcanzadosExc("Ya no quedaron copias disponibles para descargar : " + this.titulo);
        }
    }

}
