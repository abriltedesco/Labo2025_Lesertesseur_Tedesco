package poblacion;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int poblacion) {
        super(nombre);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int obtenerPoblacion(){
        return getPoblacion();
    }
}
