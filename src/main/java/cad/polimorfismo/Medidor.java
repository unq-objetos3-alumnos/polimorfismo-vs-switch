package cad.polimorfismo;

public class Medidor {
    public double areaDe(Figura figura) {
        return figura.getArea();
    }

    public double perimetroDe(Figura figura) {
        return figura.getPerimetro();
    }
}
