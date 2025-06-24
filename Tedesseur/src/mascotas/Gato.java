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
        if (alDueño) {
            System.out.println("miau");
        }
        else{
            System.out.println("MIAU!");
        }
    }
    @Override
    public void alimentar(){
        this.setPuntosAlegria(getPuntosAlegria() + 1);
    }
}