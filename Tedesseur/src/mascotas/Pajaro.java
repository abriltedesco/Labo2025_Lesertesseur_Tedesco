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
        for(int i = getPuntosAlegria() ; i > 0 ; i--) {
            if (this.esCantor && alDueño) {
                System.out.print("piopiopiopiooo ");
                i++;
            }
            else if (!alDueño) {
                System.out.println(" - ");
                i++;
            }
            else {
                System.out.print("pio ");
                i++;
            }
        }

    }

    @Override
    public void alimentar(){
        this.setPuntosAlegria(getPuntosAlegria() + 1);
    }
}
