import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 0 ;
        Scanner entrada = new Scanner (System.in);

        while (numero != -1) {
            System.out.println("Ingrese numero: ");
            numero = entrada.nextInt();
            contador++;
        }
        System.out.println("Contador: ");
        System.out.println(contador -1);
    }

}
