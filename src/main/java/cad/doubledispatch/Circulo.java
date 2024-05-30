package cad.doubledispatch;

public class Circulo implements Figura {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public <T> T realizarOperacion(OperacionSobreFiguras<T> operacion) {
        return operacion.realizarseParaCirculo(this);
    }
}
