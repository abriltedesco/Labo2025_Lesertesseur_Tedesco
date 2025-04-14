package unidad1;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn ;
    private int pags;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona autor, int isbn, int pags, String editorial, Fecha fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.pags = pags;
        this.editorial = editorial;
        this.fechaPublicacion = fecha;
    }
    public Libro(){
        this.titulo = "Orgullo y Prejuicio";
        this.autor = new Persona ("Jane Austen", 30, "xxxx");
        this.isbn = 1;
        this.pags = 352;
        this.editorial = "pinguino";
        this.fechaPublicacion = new Fecha(28, 1, 1813);
    }


    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getTitulo()
    { return titulo; }

    public void setAutor(Persona a){
        this.autor = a;
    }
    public Persona getAutor()
    { return autor; }


    public void setISBN(int i){
        this.isbn = i;
    }
    public int getIsbn()
    { return isbn; }

    public void setPaginas(int pag){
        this.pags = pag;
    }
    public int getPags()
    { return pags; }

    public void setEditorial(String e){
        this.editorial = e;
    }
    public String getEditorial()
    { return editorial; }

    public void setFechaPublicacion(Fecha fecha){
        this.fechaPublicacion = fecha;
    }
    public Fecha getFechaPublicacion()
    { return fechaPublicacion; }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + pags);
        System.out.println("Editorial: " + editorial);
        System.out.println("Fecha: " + fechaPublicacion);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Crepusculo",  new Persona ("Stephanie Meyer", 28, "xxxx"), 2, 230,  new Fecha(20, 05, 2005));
        libro2.getTitulo();
    }
}
