package operacionesBasics;

import java.util.Scanner;

public class IntroducirNums_Amp {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 0 ;
        int suma_total= 0, suma_pos = 0, suma_neg = 0;
        int mayorNum = 0;
        int menorNum = numero;

        Scanner entrada = new Scanner (System.in);

        while (numero != -1) {
            System.out.println("Ingrese numero: ");
            numero = entrada.nextInt();
            suma_total += numero;
            if(numero > mayorNum){
                mayorNum = numero;
            }

            if(numero < menorNum && numero != -1){
                menorNum = numero;
            }

            if(numero < 0 && numero != -1){
                suma_neg += numero;
            }
            else{
                suma_pos += numero;
            }
            contador++;
        }
        System.out.println("Suma de todos los nums: " +  suma_total);
        System.out.println("Suma de nums positivos: " +  suma_pos);
        System.out.println("Suma de nums negativos: " +  suma_neg);
        System.out.println("Contador: " +  (contador - 1));
        System.out.println("Mayor num: " +  mayorNum);
        System.out.println("Menor num: " +  menorNum);
    }

}

