package poblacion;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private HashSet<Coordenada> contorno;

<<<<<<< Updated upstream
    public Lugar(String nombre, String codigo) {
=======
    public Lugar(String nombre) {
>>>>>>> Stashed changes
        this.nombre = nombre;
        this.codigo = codigo;
        this.contorno = new HashSet<>();
    }

    public String getCodigo() { return codigo; }
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