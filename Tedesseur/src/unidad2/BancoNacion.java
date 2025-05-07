package unidad2;

import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean accesoDiscapacitados;
    private boolean tieneBraille;
    private ArrayList<Persona> empleados;

    public BancoNacion() {
        this.direccion = "Av. Santa Fe 2424";
        this.accesoDiscapacitados = false;
        this.tieneBraille = true;
        this.empleados = new ArrayList<>();
        empleados.add(new Persona());
        Persona p1 = new Persona("Billie", "Eilish", 13131313, LocalDate.of(2000, 12, 18), LocalDate.of(2019, 3, 4));
        Persona p2 = new Persona("eoeooe", "erertret", 453453445, LocalDate.of(1990, 2, 25), LocalDate.of(2015, 9, 7));
        empleados.add(p1);
        empleados.add(p2);
    }

    public BancoNacion(String direccion, boolean accesoDiscapacitados, boolean tieneBraille, ArrayList<Persona> empleados) {
        this.direccion = direccion;
        this.accesoDiscapacitados = accesoDiscapacitados;
        this.tieneBraille = tieneBraille;
        this.empleados = empleados;
    }

    public BancoNacion(String direccion, boolean accesoDiscapacitados, boolean tieneBraille) {
        this.direccion = direccion;
        this.accesoDiscapacitados = accesoDiscapacitados;
        this.tieneBraille = tieneBraille;
        this.empleados = new ArrayList<>();
        Persona p1 = new Persona("hjhjhgjhjg", "hgfhgfdhgf", 6464364, LocalDate.of(1987, 11, 28), LocalDate.of(2019, 3, 4));
        Persona p2 = new Persona("gfhgfhgh", "jfjhgj", 66343534, LocalDate.of(1990, 7, 25), LocalDate.of(2015, 9, 7));
        Persona p3 = new Persona();
        empleados.add(p1);
        empleados.add(p2);
        empleados.add(p3);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isAccesoDiscapacitados() {
        return accesoDiscapacitados;
    }

    public void setAccesoDiscapacitados(boolean accesoDiscapacitados) {
        this.accesoDiscapacitados = accesoDiscapacitados;
    }

    public boolean isTieneBraille() {
        return tieneBraille;
    }

    public void setTieneBraille(boolean tieneBraille) {
        this.tieneBraille = tieneBraille;
    }

    public ArrayList<Persona> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Persona> empleados) {
        this.empleados = empleados;
    }

    public void agregarTrabajador(Persona trabajador){
        empleados.add(trabajador);
    }

    public int cantidadTrabajadores(){
        return empleados.size();
    }

    public Persona empleadoMayorAntiguedad(){
        Persona empMayor = new Persona();
        for(Persona p : empleados){
            empMayor = empleados.getFirst();
            if(p.getfechaIngreso().isBefore(empMayor.getfechaIngreso())){
                empMayor = p;
            }
        }
        return empMayor;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        Persona p2 = new Persona("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28));
        Persona p3 = new Persona("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));
        Persona p4 = new Persona("Delfina", "Francis", 554545445,
                LocalDate.of(1993, 8, 17), LocalDate.of(2018, 8, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("Av. Triunvirato 3450", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("Cochrane 2874", true, true);

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregarTrabajador(p1);
        sucursalUrquiza.agregarTrabajador(p3);
        sucursalPueyrredon.agregarTrabajador(p2);

        sucursalPueyrredon.cantidadTrabajadores();

        for (BancoNacion b : sucursales) {
            Persona p = b.empleadoMayorAntiguedad();
            System.out.println(p.getNombre() + " " + p.antiguedad());
        }

    }

}
