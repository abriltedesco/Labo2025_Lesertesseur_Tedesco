/*package almuerzo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class testAlmuerzo {

    @Test
    public void testPlatoGettersSetters() {
        Plato p = new Plato("Milanesa", 100, 0);
        assertEquals("Milanesa", p.getNombre());
        assertEquals(100, p.getCantPedida());

        p.setCantPedida(150);
        assertEquals(150, p.getCantPedida());
    }

    @Test
    public void testAgregarPlato() {
        SistemaAlmuerzo sistema = new SistemaAlmuerzo();
        Plato p1 = new Plato("Empanadas", 50, 30);
        Plato p2 = new Plato("Pizza", 90, 43);

        sistema.agregarPlato(p1);
        sistema.agregarPlato(p2);

        assertEquals(2, sistema.getPlatos().size());
        assertTrue(sistema.getPlatos().contains(p1));
        assertTrue(sistema.getPlatos().contains(p2));
    }
}
*/