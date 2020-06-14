package cad.polimorfismo;

import org.junit.Assert;
import org.junit.Test;

public class TestFiguras {
    private final Medidor medidor = new Medidor();

    @Test
    public void testPerimetroCuadrado() {
        assertEquals(8, medidor.perimetroDe(new Cuadrado(2)));
    }

    @Test
    public void testPerimetroCirculo() {
        assertEquals(4 * Math.PI, medidor.perimetroDe(new Circulo(2)));
    }

    @Test
    public void testAreaCuadrado() {
        assertEquals(4, medidor.areaDe(new Cuadrado(2)));
    }

    @Test
    public void testAreaCirculo() {
        assertEquals(4 * Math.PI, medidor.areaDe(new Circulo(2)));
    }

    private void assertEquals(double expected, double actual) {
        Assert.assertEquals(expected, actual, 0.001);
    }
}
