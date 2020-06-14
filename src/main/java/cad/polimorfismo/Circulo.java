package cad.polimorfismo;

public class Circulo implements Figura {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return Math.PI * radio * 2;
    }
}
