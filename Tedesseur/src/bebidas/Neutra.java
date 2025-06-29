package bebidas;

import java.util.Scanner;

public class Neutra extends Bebida{
    public Neutra(String nombre, Tipo tipo) {
        super(nombre, tipo);
        setCoeficienteNegatividad(10);
    }

    public void calcularCoeficiente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese coeficiente positividad: ");
        int positividad = Integer.parseInt(entrada.nextLine());
        Scanner entrada2 = new Scanner(System.in);
        System.out.print("ingrese coeficiente negatividad: ");
        int negatividad = Integer.parseInt(entrada2.nextLine());
        this.setCoeficienteNegatividad(negatividad);
    }
}
