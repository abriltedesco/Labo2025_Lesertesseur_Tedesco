package objetos;

import unidad1.Fecha;
import unidad1.Persona;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn ;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona autor, int isbn, int paginas, String editorial, Fecha fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fecha;
    }

    public Libro(){
        this.titulo = "Orgullo y Prejuicio";
        this.autor = new Persona ("Jane Austen", 30, "xxxx");
        this.isbn = 1;
        this.paginas = 352;
        this.editorial = "pinguino";
        this.fechaPublicacion = new Fecha(28, 1, 1813);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo()
    { return titulo; }

    public void setAutor(Persona autor){
        this.autor = autor;
    }
    public Persona getAutor()
    { return autor; }


    public void setISBN(int isbn){
        this.isbn = isbn;
    }
    public int getIsbn()
    { return isbn; }

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public int getpaginas()
    { return paginas; }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getEditorial()
    { return editorial; }

    public void setFechaPublicacion(Fecha fecha){
        this.fechaPublicacion = fecha;
    }
    public Fecha getFechaPublicacion()
    { return fechaPublicacion; }

    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor : " + this.autor.getNombre());
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Editorial: " + this.editorial);
        System.out.println("Dia: " + this.fechaPublicacion.getDia());
        System.out.println("Mes: " + this.fechaPublicacion.getMes());
        System.out.println("Anio: " + this.fechaPublicacion.getAnio());
    }

    public void compararFechas(Fecha fecha){
        if(fecha.getDia() < fechaPublicacion.getDia() || fecha.getMes() < fechaPublicacion.getMes()){
            System.out.println("el libro es mas antiguo");
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Crepusculo",  new Persona ("Stephanie Meyer", 28, "xxxx"), 2, 230, "editorial",  new Fecha(20, 05, 2005));
        Libro libro3 = new Libro("The Hunger Games", new Persona("Suzanne Collins", 32, "zzzz"), 3, 376, "molino", new Fecha(14, 9, 2008));

        libro3.setTitulo("The Hunger Games");
        libro3.setAutor(new Persona("Suzanne Collins", 32, "zzzz"));
        libro3.setEditorial("Molino");
        libro3.setISBN(3);
        libro3.setPaginas(376);
        libro3.setFechaPublicacion(new Fecha(14, 9, 2008));
        
        System.out.println("Info del libro 1 : " ) ;
        libro1.mostrarInfo();
        System.out.println("Info del libro 2 : " ) ;
        libro2.mostrarInfo();
        System.out.println("Info del libro 3 : " ) ;
        libro3.mostrarInfo();

        libro1.compararFechas(libro3.getFechaPublicacion());
        libro2.compararFechas(libro1.getFechaPublicacion());

    }
}
