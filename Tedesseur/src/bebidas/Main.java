package bebidas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Neutra n1 = new Neutra("SmartWater", 10, Tipo.NEUTRAS);
        Neutra n2 = new Neutra("VillaVicencio", 10, Tipo.NEUTRAS);

        Azucarada az1 = new Azucarada("Coca Cola", 15, Tipo.AZUCARADAS, 50);
        Azucarada az2 = new Azucarada("Fanta", 10, Tipo.AZUCARADAS, 25);

        Alcohol al1 = new Alcohol("Fernet", 70, 40, Tipo.ALCOHOLICAS, 40);
        Alcohol al2 = new Alcohol("Aperol", 30, 70, Tipo.ALCOHOLICAS, 80);

        Persona p1 = new Persona("Pink", "Pantheress", "4444444", new ArrayList<Bebida>()); 
        p1.getBebidas().add(n1);
        p1.getBebidas().add(n2);
        
        for(Bebida bebida : p1.getBebidas()){
        System.out.println(bebida.getNombre() + " " + bebida.getCoeficienteNegatividad() + " " + bebida.getCoeficientePositividad());
        }
    }
}
