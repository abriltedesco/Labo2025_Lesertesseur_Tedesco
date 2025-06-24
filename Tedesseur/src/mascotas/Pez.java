package mascotas;

public class Pez extends Mascota{
    private static int vidas = 10;

    public Pez() {
        super();
    }

    public Pez(String nombre, Dueño dueño, Tipo tipo, int puntosAlegria) {
        super(nombre, dueño, tipo, puntosAlegria);
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    public String mascotaEsDelTipo(){
        return Tipo.PEZ.name();
    }

    @Override
    public void saludo(boolean alDueño){
        if(alDueño) {
            this.setVidas(getVidas() - 1);
        }
        else{
            this.setVidas(0);
        }
    }

    @Override
    void alimentar() {
        this.setVidas(this.getVidas() +1);
    }
}
