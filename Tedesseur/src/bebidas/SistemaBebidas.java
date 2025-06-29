package bebidas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBebidas {
    private ArrayList<Persona> personas;

    public SistemaBebidas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public SistemaBebidas() {
        Persona p1 = new Persona("Damon", "Albarn", "1111111", new ArrayList<Consumicion>());
        this.personas = new ArrayList<>();
        personas.add(p1);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public boolean dniExiste(String dni_ingresado){
        for(Persona persona : personas){
            if( dni_ingresado.equalsIgnoreCase(persona.getDni()) ){
                return true;
            }
        }
        return false;
    }

    public void agregarPersona(ArrayList<Persona> personasMain){
        for(Persona persona : personasMain) {
            if (this.dniExiste(persona.getDni())) {
                System.out.println("dni ya existe, no se puede agregar");
            }
            else {
                this.personas.add(persona);
                System.out.println("agregado al sistema exitosamente");
            }
        }
    }

    public Persona personaConMayorCoeficiente(){
        Persona mayorCoeficiente = personas.get(0);
        for(int i = 0; i < personas.size() - 1; i++){
            if(mayorCoeficiente.getCoeficiente() < personas.get(i + 1).getCoeficiente()){
                mayorCoeficiente = personas.get(i+1);
            }
        }

        return mayorCoeficiente;
    }

    public Persona personaConMenorCoeficiente(){
        Persona menorCoeficiente = personas.get(0);
        for(int i = 0; i < personas.size() - 1; i++){
            if(menorCoeficiente.getCoeficiente() > personas.get(i + 1).getCoeficiente()){
                menorCoeficiente = personas.get(i + 1);
            }
        }
        return menorCoeficiente;
    }

    public void mostrarCoeficientes(){
        System.out.println("......");
        System.out.println("Lista de personas y sus coeficientes");
        for(Persona persona : this.getPersonas()){
            System.out.println(persona.getNombre() + " | " + persona.getCoeficiente());
        }
        System.out.println("Persona con mayor coeficiente: " + this.personaConMayorCoeficiente().getNombre() );
        System.out.println("Persona con menor coeficiente: " + this.personaConMenorCoeficiente().getNombre() );
    }


    public Bebida bebidaIngresada (String nombre_bebida){
        for(Persona persona : personas) {
            for (Consumicion consumicion : persona.getBebidas()) {
                if (consumicion.getBebida().getNombre() == nombre_bebida) {
                    return consumicion.getBebida();
                }
            }
        }
        return null;
    }

    public Persona personaConDni(String dniUser){
       for(Persona persona : personas) {
           if(persona.getDni() == dniUser){
               return persona;
           }
       }
       return null;
    }

    public void usuarioElijeConsumicion(){
        System.out.println("ingrese su dni: ");
        Scanner entrada = new Scanner(System.in);
        String dni = entrada.next();

        System.out.println("ingrese bebida: ");
        Scanner entrada2 = new Scanner(System.in);
        String bebida = entrada2.next();

        Scanner entrada3 = new Scanner(System.in);
        System.out.print("ingrese cant: ");
        int cant = Integer.parseInt(entrada3.nextLine());

        if (this.bebidaIngresada(bebida) != null || this.personaConDni(dni) != null){
            this.personaConDni(dni).agregarConsumicion(this.bebidaIngresada(bebida), cant);
            System.out.println("se completado su consumicion");
            mostrarCoeficientes();
        }
        else if (this.bebidaIngresada(bebida) != null &&  this.personaConDni(dni) != null){
            System.out.println("bebida y dni ingresado no existen");
        }
        else{
            System.out.println("bebida o dni ingresado no existe");
        }
    }
}
