package drones;

public class SD {
    private int almacenamiento;

    public SD(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }


    public SD() {
        this.almacenamiento = 100;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean tieneAlmacenamiento() {
        return this.almacenamiento > 12 ? true : false;
    }
}
