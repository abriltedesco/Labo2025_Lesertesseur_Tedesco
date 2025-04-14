package primerosEjercicios;

import java.util.Scanner;
public class IngresoDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n = entrada.nextInt();
        double a = entrada.nextDouble();
        String charsito = entrada.nextLine();
        char c = charsito.charAt(0);
        
        System.out.println("Valor de n: " + n);
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de c: "  + c);

        System.out.println("Suma n + a: " + (n + a));
        System.out.println("Diferencia a - n: " + (a - n));
        System.out.println("Valor: " + (int) c);
    }
}