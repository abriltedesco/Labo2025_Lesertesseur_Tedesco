package bares;

import java.util.HashMap;
import java.util.HashSet;

public class DeGaseosa extends Beneficio implements Acumulable{
    public DeGaseosa(String nombre, String usuario) {
        super(nombre, usuario);
    }
    @Override
    public int aplicarDescuentoExtra() {
        return 1000;
    }
}
