import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Empresa {
    private static String nombre = "Sabores del sur";
    private HashSet<Chef> chefs;
    private HashSet<Cliente> clientes;
    private static HashMap<Especialidad, Integer> precioBase = Empresa.crearPreciosBase();
    private static HashMap<Especialidad, Double> comisiones = Empresa.crearComision();

    public static HashMap<Especialidad, Integer> crearPreciosBase(){
        HashMap<Especialidad, Integer> aux = new HashMap<>();
        aux.put(Especialidad.GOURMET, 45000);
        aux.put(Especialidad.PASTELERIA, 35000);
        aux.put(Especialidad.PARILLA, 28000);
        aux.put(Especialidad.VEGANA, 32000);
        return aux;
    }

    public static HashMap<Especialidad, Double> crearComision(){
        HashMap<Especialidad, Double> aux = new HashMap<>();
        aux.put(Especialidad.GOURMET, 0.24);
        aux.put(Especialidad.PASTELERIA, 0.18);
        aux.put(Especialidad.PARILLA, 0.14);
        aux.put(Especialidad.VEGANA, 0.16);
        return aux;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Empresa.nombre = nombre;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public static HashMap<Especialidad, Integer> getPrecioBase() {
        return precioBase;
    }

    public static void setPrecioBase(HashMap<Especialidad, Integer> precioBase) {
        Empresa.precioBase = precioBase;
    }

    public static HashMap<Especialidad, Double> getComisiones() {
        return comisiones;
    }

    public static void setComisiones(HashMap<Especialidad, Double> comisiones) {
        Empresa.comisiones = comisiones;
    }

    public void mostrarInfoDeCadaChef(){
        for(Chef chef : chefs){
            System.out.println("Chef: " + chef.getNombre());
            chef.resumenCompleto();
        }
    }

    public void registrarEvento(Chef chef, Cliente cliente, LocalDate fecha){
        for(Chef ch: this.chefs){
            if(ch.equals(chef)){
                ch.crearEvento(cliente, fecha);
            }
            else{
                System.out.println("no existe el chef");
            }
        }
    }
}
