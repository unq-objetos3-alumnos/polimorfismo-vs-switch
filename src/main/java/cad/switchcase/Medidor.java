package cad.switchcase;

public class Medidor {
    public double areaDe(Figura figura) {
        switch (figura.getClass().getName()) {
            case "cad.switchcase.Cuadrado":
                return ((Cuadrado) figura).getLado() * ((Cuadrado) figura).getLado();
            case "cad.switchcase.Circulo":
                return Math.PI * ((Circulo) figura).getRadio() * ((Circulo) figura).getRadio();
            default:
                throw new RuntimeException("Tipo de figura desconocido");
        }
    }

    public double perimetroDe(Figura figura) {
        switch (figura.getClass().getName()) {
            case "cad.switchcase.Cuadrado":
                return 4 * ((Cuadrado) figura).getLado();
            case "cad.switchcase.Circulo":
                return Math.PI * ((Circulo) figura).getRadio() * 2;
            default:
                throw new RuntimeException("Tipo de figura desconocido");
        }
    }
}
