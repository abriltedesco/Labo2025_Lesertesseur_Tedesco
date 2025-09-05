package ejercicios.ShopApp.caseStudy;

public class HRApp {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "juansito", 55555);
        Empleado e2 = new Empleado(2, "juansita", 66666);
        Empleado e3 = new Empleado(3, "juana", 77777);

        Departamento d1 = new Departamento(1);
        Departamento d2 = new Departamento(2);
        d1.agregarEmpleado(e1);
        d1.agregarEmpleado(e2);
        d2.agregarEmpleado(e3);

        Empleado[] empleadosD1 = d1.getEmpleados();
        Empleado[] empleadosD2 = d1.getEmpleados();

        for(Empleado e : empleadosD1){
            System.out.println("Emp " + e.getNombre());
        }

        System.out.println("Total d1: " + d1.salarioTotal());
        System.out.println("Total d2: " + d2.salarioTotal());
        System.out.println("Prom d2: " + d2.promSalario());
        System.out.println("Prom d1: " + d1.promSalario());
        System.out.println("Empleado: " + d1.agarrarPorId(1).getNombre());
    }
}
