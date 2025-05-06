package unidad2;

import unidad1.Persona;

import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Estante> estanteria;
    private String direccion;
    private int codigoPostal;
    private int comuna;

    public Videoclub(){
        Estante estante1 = new Estante();
        Estante estante2 = new Estante();
        estante2.setNumero(2);
        ArrayList<Pelicula> pelis= new ArrayList<>();
        estante2.setPeliculas(pelis);
        this.estanteria = new ArrayList<>();
        estanteria.add(estante1);
        this.direccion = "constituyentes 2424";
        this.codigoPostal = 1419;
        this.comuna = 20;
    }

    public Videoclub(ArrayList<Estante> estanteria, String direccion, int codigoPostal, int comuna) {
        this.estanteria = estanteria;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.comuna = comuna;
    }

    public ArrayList<Estante> getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(ArrayList<Estante> estanteria) {
        this.estanteria = estanteria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getComuna() { return comuna; }

    public void setComuna(int comuna) { this.comuna = comuna; }

    // ABM
    public void agregarEstanteria(Estante estante){
        this.estanteria.add(estante);
    }
    public void eliminarEstanteria(Estante estante){
        this.estanteria.remove(estante);
    }

    public void modificarEstanteria(Estante estante){
        agregarEstanteria(estante);
        eliminarEstanteria(estante);
    }

    // B)
    public void peliMayorDuracion(){
        Pelicula peliMayor = new Pelicula();
        Estante estanteMayor = estanteria.get(0);

        for(Estante estante: estanteria){
            for(Pelicula pelicula: estante.getPeliculas()){
                if(pelicula.getDuracion() > peliMayor.getDuracion()){
                    peliMayor = pelicula;
                    estanteMayor = estante;
                }
            }
        }
        System.out.println("peli: " + peliMayor.getTitulo() + " estanteria: " + estanteMayor.getNumero());
    }

    // D)
    public void directorMasFrecuentes(){
        ArrayList<Pelicula> pelis;
        ArrayList<Persona> directores = new ArrayList<>();
        Estante estanteConDirector = new Estante();

        for(Estante estante: estanteria){
            pelis = estante.getPeliculas();
            for(int i = 0; i < pelis.size(); i++){
                for(Persona director: pelis.get(i).getDirectores()){
                    for(Persona director2 : pelis.get(i + 1).getDirectores()) {
                        if(director.getNombre().equals(director2.getNombre())){
                            directores.add(director);
                        }
                    }
                }
            }
        }

        for(Persona director: directores){
            System.out.println("director: " + director.getNombre());
        }

    }

}
