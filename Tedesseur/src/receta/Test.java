package receta;


public class Test {
    
    @BeforeEach
    public void setUp() {
        entrada = new Entrada("rabas", pasos, Tipo.ENTRADA,Temperatura.CALIENTE);
        principal = new Principal("Asado", pasosPrincipal, Tipo.PRINCIPAL, 120, 6);
        postre = new Postre("Chocotorta", pasosPostre, Tipo.POSTRE, 0, false);
    }
    
    @Test
    public void testAtributosEntrada(){
        assertEquals(Temperatura.CALIENTE, entrada.getTemperatura());
        assertEquals("rabas", entrada.getNombre());

    }

    @test public void testAtributosPrincipal(){
        assertEquals("Asado", principal.getNombre());
        assertEquals(120, principal.getTiempoCoccion);
    }

    @test public void testAtributosPostre(){
        assertEquals("Chocotorta", postre.getNombre());
        assertEquals(false, postre.isAptoDiabetico());
    }

    @test public void testRecordatorioPostre(){
        postre.recordatorio();
        assertEquals("Mantener la cocina limpia y el horno al mínimo.", postre.recordatorio());
    }
    
    @test public void testRecordatorioPrincipal(){
        principal.recordatorio();
        assertEquals("Esta receta tarda en cocinarse " + 120, principal.recordatorio());
    }
}
