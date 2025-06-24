package mascotas;

public class Pajaro extends Mascota{
    private boolean esCantor;

    public Pajaro() {
        super();
        this.esCantor = true;
    }

    public Pajaro(String nombre, Dueño dueño, Tipo tipo, int puntosAlegria, boolean esCantor) {
        super(nombre, dueño, tipo, puntosAlegria);
        this.esCantor = esCantor;
    }

    public String mascotaEsDelTipo(){
        return Tipo.PAJARO.name();
    }

    @Override
    public void saludo(boolean alDueño){
        int alegriaActual = this.getPuntosAlegria();
        for (int i = 0; i < alegriaActual; i++) {
            if (this.esCantor && alDueño) {
                System.out.print("piopiopiopiooo ");
            }
            else if (!alDueño) {
                System.out.println(" - ");
            }
            else {
                System.out.print("pio ");
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
