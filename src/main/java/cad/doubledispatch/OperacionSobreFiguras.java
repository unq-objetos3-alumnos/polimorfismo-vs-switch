package cad.doubledispatch;

public interface OperacionSobreFiguras<T> {
    T realizarseParaCuadrado(Cuadrado cuadrado);

    T realizarseParaCirculo(Circulo circulo);
}
