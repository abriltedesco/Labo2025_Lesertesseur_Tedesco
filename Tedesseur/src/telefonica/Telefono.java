package telefonica;

public class Telefono {
    private String numero;
    private EmpleadoTelefonica empleado;

    public EmpleadoTelefonica getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoTelefonica empleado) {
        this.empleado = empleado;
    }

    public Telefono(String numero) {
        this.numero = numero;
    }

    public Telefono() {
        this.numero = "47973754";
        this.empleado = new EmpleadoTelefonica("Juan", "Andrez", "48888888", "Andorra");
    }

    public Telefono(String numero, EmpleadoTelefonica empleado) {
        this.numero = numero;
        this.empleado = empleado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
