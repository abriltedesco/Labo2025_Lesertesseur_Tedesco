package poblacion;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private String codigo;
    private HashSet<Coordenada> contorno;

    public Lugar(String nombre, String codigo) {
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