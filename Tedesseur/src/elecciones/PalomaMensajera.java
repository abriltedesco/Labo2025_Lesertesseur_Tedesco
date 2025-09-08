package elecciones;

import animal.Ave;

public class PalomaMensajera extends Ave implements Mensajes{
    private boolean aprendio;

    public PalomaMensajera(String nombre, String color, boolean aprendio) {
        super(nombre, color);
        this.aprendio = aprendio;
    }

    @Override
    public void enviarMensaje() {
        if (aprendio) {
            System.out.println("Lanzando un papelito que dice:");
        } else {
            System.out.println();
        }
    }
}
