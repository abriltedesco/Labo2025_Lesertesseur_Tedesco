package mascotas;

public class Perro extends Mascota{
    public Perro() {
        super();
    }

    public Perro(String nombre, Dueño dueño, Tipo tipo, int puntosAlegria) {
        super(nombre, dueño, tipo, puntosAlegria);
    }

    public String mascotaEsDelTipo(){
        return Tipo.PERRO.name();
    }

    @Override
    public void saludo(boolean alDueño){
        int alegriaActual = getPuntosAlegria();
        for (int i = 0; i < alegriaActual; i++) {
            if (alDueño) {
                System.out.println("guau ");
            } else {
                System.out.println("GUAU! ");
            }
        }
        if (alegriaActual > 0) {
            this.setPuntosAlegria(alegriaActual - 1);
        }
    }
    @Override
    public void alimentar(){
        this.setPuntosAlegria(getPuntosAlegria() + 1);
    }
}
