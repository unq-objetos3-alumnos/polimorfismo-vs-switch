package cad.doubledispatch;

public class Medidor {
    public double areaDe(Figura figura) {
        return figura.realizarOperacion(new CalculoDeArea());
    }

    private static class CalculoDeArea implements Operacion {
        @Override
        public double realizarseParaCuadrado(Cuadrado cuadrado) {
            return cuadrado.getLado() * cuadrado.getLado();
        }

        @Override
        public double realizarseParaCirculo(Circulo circulo) {
            return Math.PI * circulo.getRadio() * circulo.getRadio();
        }
    }

    public double perimetroDe(Figura figura) {
        return figura.realizarOperacion(new CalculoDePerimetro());
    }

    private static class CalculoDePerimetro implements Operacion {
        @Override
        public double realizarseParaCuadrado(Cuadrado cuadrado) {
            return 4 * cuadrado.getLado();
        }

        @Override
        public double realizarseParaCirculo(Circulo circulo) {
            return Math.PI * circulo.getRadio() * 2;
        }
    }
}
