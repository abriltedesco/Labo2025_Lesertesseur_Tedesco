import java.util.HashSet;

public class Departamento {
    private String nombre;
    private HashSet<Empleado> empleados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new HashSet<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public int cantEmpleados() {
        return this.empleados.size();
    }

    public HashSet<Empleado> mostrarEmpleados() {
        HashSet<Empleado> empleadosTotales = new HashSet<>();
        for (Empleado empleado : empleados) {
            empleadosTotales.add(empleado);
        }

        return empleadosTotales;
    }

    public Empleado identidicarEmpleado(int id) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                empleadoEncontrado = empleado;
            }
        }
        empleadoEncontrado.toString();
        return empleadoEncontrado;
    }

    public double salarioTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getSalario();
        }

        return total;
    }

    public double promedioSalario() {
        return salarioTotal() / empleados.size();

    }

    @Override
    public String toString() {

        return "Nombre depto: " + getNombre();
    }

    public void mostrarInfoTodosEmpleados(){
        for(Empleado empleado : empleados){
            empleado.toString();
        }
    }
}
