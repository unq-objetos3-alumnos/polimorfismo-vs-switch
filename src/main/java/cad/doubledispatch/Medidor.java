package cad.doubledispatch;

public class Medidor {
    public Double areaDe(Figura figura) {
        return figura.realizarOperacion(new CalculoDeArea());
    }

    private static class CalculoDeArea implements OperacionSobreFiguras<Double> {
        @Override
        public Double realizarseParaCuadrado(Cuadrado cuadrado) {
            return cuadrado.getLado() * cuadrado.getLado();
        }

        @Override
        public Double realizarseParaCirculo(Circulo circulo) {
            return Math.PI * circulo.getRadio() * circulo.getRadio();
        }
    }

    public Double perimetroDe(Figura figura) {
        return figura.realizarOperacion(new CalculoDePerimetro());
    }

    private static class CalculoDePerimetro implements OperacionSobreFiguras<Double> {
        @Override
        public Double realizarseParaCuadrado(Cuadrado cuadrado) {
            return 4 * cuadrado.getLado();
        }

        @Override
        public Double realizarseParaCirculo(Circulo circulo) {
            return Math.PI * circulo.getRadio() * 2;
        }
    }
}
