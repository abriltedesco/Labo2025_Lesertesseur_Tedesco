package operacionesBasics;

public class Vocales {
    public static void main(String[] args) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A'};
        int cantVocales = 0;

        String frase = "Ayer me compre muñecos de la marca ‘ToyCo’ por internet.";
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < 6; j++) {
                char letra = frase.charAt(i);
                if (letra == (vocales[j])) {
                    cantVocales ++ ;
                }
            }
        }
        System.out.println(cantVocales);
    }
}