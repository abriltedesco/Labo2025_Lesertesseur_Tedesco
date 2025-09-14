public class HRApp {
    public static void main(String[] args) {
        System.out.println("El programa se ha iniciado");
        System.out.println("--------------------------------");

        Empleado e1 = new Empleado(1, "Carlos", 10000); 
        Empleado e2 = new Empleado(2, "Juan", 13250); 
        Empleado e3 = new Empleado(3, "Domingo", 14500); 
        Departamento d1 = new Departamento("Departamento 1");

        d1.agregarEmpleado(e1);
        d1.agregarEmpleado(e2);
        d1.agregarEmpleado(e3);

        System.out.println(d1.toString());
        System.out.println(d1.identidicarEmpleado(1));
        d1.mostrarInfoTodosEmpleados();
        System.out.println(d1.salarioTotal());
        System.out.println(d1.promedioSalario());
    }
}
