package operacionesBasics;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese dos palabras:");
        palabra1 = entrada.nextLine();
        palabra2 = entrada.nextLine();
        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }
        else{
            System.out.println("Las palabras NO son iguales");
        }
    }
}
