package cad.doubledispatch;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public <T> T realizarOperacion(OperacionSobreFiguras<T> operacion) {
        return operacion.realizarseParaCuadrado(this);
    }
}
