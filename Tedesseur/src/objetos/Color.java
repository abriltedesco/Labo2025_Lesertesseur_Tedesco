package objetos;

public enum Color {
    BLANCO("#ffffff"), NEGRO("#000000"), GRIS("#858585"), AZUL("#081ac2"), ROSA("#c208a6"), ROJO("#c20808"), VERDE("#235c26"), AMARILLO("#fcba03");

    private String hexaCode;
    private Color (String hexaCode){
        this.hexaCode = hexaCode;
    }
}
