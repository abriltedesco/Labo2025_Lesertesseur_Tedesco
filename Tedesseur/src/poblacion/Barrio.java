package poblacion;

public class Barrio extends Lugar{
    private int poblacion;
    public Barrio(String nombre, String codigo, int poblacion) {
        super(nombre, codigo);
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