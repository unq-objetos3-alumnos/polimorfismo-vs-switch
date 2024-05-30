package cad.doubledispatch;

public interface Figura {
    <T> T realizarOperacion(OperacionSobreFiguras<T> operacion);
}
