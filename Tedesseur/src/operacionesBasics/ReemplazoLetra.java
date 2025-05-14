package operacionesBasics;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String ingreso = entrada.nextLine();
        char letraIngresada = ingreso.charAt(0);
        String nueva_frase = "";

        String frase = "Ayer me compre muñecos de la marca ‘ToyCo’ por internet.";
       for (int i = 0; i < frase.length(); i++) {
           char letra = frase.charAt(i);

           if (letra == 'e') {
               nueva_frase = frase.replace(letra, letraIngresada);
           }
       }
        System.out.println(nueva_frase);
    }
}
