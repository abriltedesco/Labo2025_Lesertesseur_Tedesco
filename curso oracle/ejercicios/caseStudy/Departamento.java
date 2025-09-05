package ejercicios.ShopApp.caseStudy;

public class Departamento {
    private int id;
    private Empleado[] empleados = new Empleado[5];
    private int indiceUltEmp = -1;

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
        Empleado[] actuales = new Empleado[indiceUltEmp+1];
        for(int i = 0; i < actuales.length ; i++){
            actuales[i] = empleados[i];
        }
        return actuales;
    }

    public int getCantEmp(){
        return indiceUltEmp + 1;
    }

    public Empleado agarrarPorId(int id){
        for(Empleado emp : empleados){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado emp){
        if(indiceUltEmp < empleados.length){
            indiceUltEmp++;
            empleados[indiceUltEmp] = emp;
        }
    }

    public double salarioTotal(){
        double total = 0.0;
        for(int i = 0; i<=indiceUltEmp ; i++){
            total += empleados[i].getSalario();
        }
        return total;
    }

    public double promSalario(){
        double prom = 0;
        if(indiceUltEmp > -1){
            prom = salarioTotal()/ (indiceUltEmp ++ );
        }
        return prom;
    }
}
