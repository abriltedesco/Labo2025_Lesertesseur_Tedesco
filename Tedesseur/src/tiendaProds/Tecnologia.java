package tiendaProds;

public enum Tecnologia {
    CUATROK(3840, 2160), FULLHD(1920, 1080), ULTRAHD(3840, 2160);

    private int pixelsVertical;
    private int pixelsHorizontal;
    private Tecnologia (int pixelsVertical, int pixelsHorizontal){
        this.pixelsVertical = pixelsVertical;
        this.pixelsHorizontal = pixelsHorizontal;
    }
}
