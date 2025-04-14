package primerosEjercicios;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dia: ");
        String dia = entrada.nextLine();

        if (dia.equals("sabado")  || dia.equals("domingo") ){
            System.out.println("Dia no laborable");
        }
        else{
            System.out.println("Dia laborable");
        }
    }
}
