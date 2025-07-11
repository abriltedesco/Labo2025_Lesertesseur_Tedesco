package mascotas;

public class Gato extends Mascota{
    public Gato(String nombre, Dueño dueño, Tipo tipo, int puntosAlegria) {
        super(nombre, dueño, tipo, puntosAlegria);
    }

    public Gato() {
        super();
    }

    public String mascotaEsDelTipo(){
        return Tipo.GATO.name();
    }

    @Override
    public void saludo(boolean alDueño){
        String saludoPredeterminado = "miau ";
        int alegriaActual = this.getPuntosAlegria();
        for (int i = 0; i < alegriaActual; i++) {
            if (alDueño) {
                System.out.print(saludoPredeterminado);
            } else {
                System.out.print(saludoPredeterminado.toUpperCase() + "! ");
            }
        }
        if (alegriaActual > 0) {
            this.setPuntosAlegria(alegriaActual - 1);
        }
    }
    @Override
    public void alimentar(){
        this.setPuntosAlegria(this.getPuntosAlegria() + 1);
    }
}