package ejercicios.ShopApp.caseStudy;

public class Departamento {
    private int id;
    private Empleado[] empleados = new Empleado[5];
    public Departamento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado[] getEmpleados() {
        Empleado[] actuales = new Empleado[0];
        for(int i = 0; i < actuales.length ; i++){
            actuales[i] = empleados[i];
        }
        return actuales;
    }

    public int getCantEmp(){
        return empleados.length;
    }

    public Empleado agarrarPorId(int id){
        for(Empleado emp : empleados){
            if(emp.getId() == id){ return emp; }
        }
        return null;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado emp){
        Empleado[] nuevo = java.util.Arrays.copyOf(this.empleados, this.empleados.length + 1);;
        nuevo[nuevo.length + 1] = emp;
        this.empleados = nuevo;
    }

    public double salarioTotal(){
        double total = 0.0;
        for(int i = 0; i <= empleados.length ; i++){
            total += empleados[i].getSalario();
        }
        return total;
    }

    public double promSalario(){
        double prom = 0;
        int ultimoEmp = this.empleados.length - 1;
        if(ultimoEmp > -1){
            prom = salarioTotal()/ultimoEmp ++;
        }
        return prom;
    }
}
