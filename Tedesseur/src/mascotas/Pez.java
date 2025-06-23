package mascotas;

public class Pez extends Mascota{
    private static int vidas = 10;

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    public void saludo(){
        if(saludoUnDueño()) {
            setVidas(getVidas() - 1);
        }
        else{
            setVidas(0);
        }
    }
}
