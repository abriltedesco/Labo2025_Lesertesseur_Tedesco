package poblacion;

import java.util.HashSet;

public abstract class Lugar {
<<<<<<< Updated upstream
    private String nombre;
    private String codigo;
    private HashSet<Coordenada> contorno;
    
    public Lugar(String nombre, String codigo) {
=======
    private String nombre;;
    private HashSet<Coordenada> contorno; // Representa el contorno

    public Lugar(String nombre) {
>>>>>>> Stashed changes
        this.nombre = nombre;
        this.contorno = new HashSet<>();
    }

    public String getNombre() { return nombre; }
    public HashSet<Coordenada> getContorno() { return contorno; }


    public void agregarCoordenada(Coordenada coordenada) { contorno.add(coordenada); }
    public void borrarCoordenada(Coordenada coordenada) { contorno.remove(coordenada); }
    public void modificarCoordenadas(Coordenada coordenadaNueva, Coordenada coordenadaVieja) {
        borrarCoordenada(coordenadaVieja);
        agregarCoordenada(coordenadaNueva);
    }

    public abstract int obtenerPoblacion();
}
