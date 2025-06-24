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
        if(alDueño) {
            System.out.println("guau");
        }
        else{
            System.out.println("GUAU!");
        }
    }
    @Override
    public void alimentar(){
        this.setPuntosAlegria(getPuntosAlegria() + 1);
    }
}
