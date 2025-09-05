package dispositivos;

public abstract class DispositivoPadre {
    private String fabricante;
    private String modelo;

    public DispositivoPadre(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public DispositivoPadre() {
        this.fabricante = "SADDADDFD";
        this.modelo = "modelito";
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
