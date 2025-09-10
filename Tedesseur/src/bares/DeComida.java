package bares;

import almuerzo.Plato;

import java.util.HashSet;

public class DeComida implements Acumulable{
    private HashSet<Plato> platos;
    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
