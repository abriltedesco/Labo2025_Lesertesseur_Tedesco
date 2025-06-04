package biblioteca;

import personas.Persona;
import fecha.Fecha;

public class Libro {
    private String titulo;
    private Persona autor;
    private int isbn ;
    private int paginas;
    private Editorial editorial;
    private Fecha fechaPublicacion;

    public Libro(String titulo, Persona autor, int isbn, int paginas, Editorial editorial, Fecha fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.fechaPublicacion = fecha;
    }

    public Libro(){
        this.titulo = "Orgullo y Prejuicio";
        this.autor = new Persona ("Jane",  "Austen", 30);
        this.isbn = 1;
        this.paginas = 352;
        this.editorial = Editorial.KAPELUSZ;
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

    public void setEditorial(Editorial editorial){
        this.editorial = editorial;
    }
    public Editorial getEditorial()
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
        Libro libro2 = new Libro("Crepusculo",  new Persona ("Stephanie", "Meyer", 28), 2, 230, Editorial.SUDAMERICANA,  new Fecha(20, 05, 2005));
        Libro libro3 = new Libro();

        libro3.setTitulo("The Hunger Games");
        libro3.setAutor(new Persona("Suzanne", "Collins", 32));
        libro3.setEditorial(Editorial.EL_ATENEO);
        libro3.setISBN(3);
        libro3.setPaginas(376);
        libro3.setFechaPublicacion(new Fecha(14, 9, 2008));
        
        System.out.println("INFO DEL LIBRO 1" ) ;
        libro1.mostrarInfo();
        System.out.println("INFO DEL LIBRO 2" ) ;
        libro2.mostrarInfo();
        System.out.println("INFO DEL LIBRO 3" ) ;
        libro3.mostrarInfo();

        libro1.compararFechas(libro3.getFechaPublicacion());
        libro2.compararFechas(libro1.getFechaPublicacion());

    }
}
