package tiendaProds;

import java.util.ArrayList;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        SistemaTienda s1 = new SistemaTienda(new ArrayList<>());


        Televisor t1 = new Televisor("Philips", 200000, 250, Seccion.MULTIMEDIA, Tecnologia.ULTRAHD);
        Televisor t2 = new Televisor("Sony", 300000, 100, Seccion.MULTIMEDIA, Tecnologia.CUATROK);
        Televisor t3 = new Televisor("Noblex", 350000, 140, Seccion.MULTIMEDIA, Tecnologia.FULLHD);

        EquipoSonido e1 = new EquipoSonido("JBL", 45000, 4300, true);
        EquipoSonido e2 = new EquipoSonido("Philips", 34000, 43000, true);
        EquipoSonido e3 = new EquipoSonido("Samsung", 4000, 12000, false);

        CargadorPortatil c1 = new CargadorPortatil("Mixio", 34000, 200, Seccion.CARGADORES, 40);
        CargadorPortatil c2 = new CargadorPortatil("Gadnic", 38000, 120, Seccion.CARGADORES, 40);
        CargadorPortatil c3 = new CargadorPortatil("Samsung", 33000, 250, Seccion.CARGADORES, 40);

        s1.agregarProducto(t1);
        s1.agregarProducto(t2);
        s1.agregarProducto(t3);
        s1.agregarProducto(e1);
        s1.agregarProducto(e2);
        s1.agregarProducto(e3);
        s1.agregarProducto(c1);
        s1.agregarProducto(c2);
        s1.agregarProducto(c3);

        s1.mostrarProductos();
    }
}
