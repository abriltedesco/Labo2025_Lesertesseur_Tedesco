package BancoNacion;

import personas.EmpleadoBanco;


import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean accesoDiscapacitados;
    private boolean tieneBraille;
    private ArrayList<EmpleadoBanco> empleados;

    public BancoNacion() {
        this.direccion = "Av. Santa Fe 2424";
        this.accesoDiscapacitados = false;
        this.tieneBraille = true;
        this.empleados = new ArrayList<>();
        empleados.add(new EmpleadoBanco());
        EmpleadoBanco p1 = new EmpleadoBanco("Billie", "Eilish", 13131313, LocalDate.of(2000, 12, 18), LocalDate.of(2019, 3, 4));
        EmpleadoBanco p2 = new EmpleadoBanco("eoeooe", "erertret", 453453445, LocalDate.of(1990, 2, 25), LocalDate.of(2015, 9, 7));
        empleados.add(p1);
        empleados.add(p2);
    }

    public BancoNacion(String direccion, boolean accesoDiscapacitados, boolean tieneBraille, ArrayList<EmpleadoBanco> empleados) {
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
        EmpleadoBanco p1 = new EmpleadoBanco("hjhjhgjhjg", "hgfhgfdhgf", 6464364, LocalDate.of(1987, 11, 28), LocalDate.of(2019, 3, 4));
        EmpleadoBanco p2 = new EmpleadoBanco("gfhgfhgh", "jfjhgj", 66343534, LocalDate.of(1990, 7, 25), LocalDate.of(2015, 9, 7));
        EmpleadoBanco p3 = new EmpleadoBanco();
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

    public ArrayList<EmpleadoBanco> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<EmpleadoBanco> empleados) {
        this.empleados = empleados;
    }

    public void agregarTrabajador(EmpleadoBanco trabajador){
        empleados.add(trabajador);
    }

    public int cantidadTrabajadores(){
        return empleados.size();
    }

    public EmpleadoBanco empleadoMayorAntiguedad(){
        EmpleadoBanco empMayor = new EmpleadoBanco();
        for(EmpleadoBanco p : empleados){
            empMayor = empleados.getFirst();
            if(p.getfechaIngreso().isBefore(empMayor.getfechaIngreso())){
                empMayor = p;
            }
        }
        return empMayor;
    }

    public static void main(String[] args) {
        EmpleadoBanco p1 = new EmpleadoBanco("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8));
        EmpleadoBanco p2 = new EmpleadoBanco("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28));
        EmpleadoBanco p3 = new EmpleadoBanco("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25));
        EmpleadoBanco p4 = new EmpleadoBanco("Delfina", "Francis", 554545445,
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
            EmpleadoBanco p = b.empleadoMayorAntiguedad();
            System.out.println(p.getNombre() + " " + p.antiguedad());
        }

    }

}
