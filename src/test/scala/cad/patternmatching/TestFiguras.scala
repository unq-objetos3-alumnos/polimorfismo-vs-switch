package cad.patternmatching

import org.scalatest.funspec.AnyFunSpec

class TestFiguras extends AnyFunSpec {
  val medidor = new Medidor
  val graficador = new Graficador

  it("calcula el perímetro de cuadrados") {
    assert(medidor.perimetroDe(Cuadrado(2)) == 8)
  }

  it("calcula el perímetro de círculos") {
    assert(medidor.perimetroDe(Circulo(2)) == 4 * Math.PI)
  }

  it("calcula el área de cuadrados") {
    assert(medidor.areaDe(Cuadrado(2)) == 4)
  }

  it("calcula el área de círculos") {
    assert(medidor.areaDe(Circulo(2)) == 4 * Math.PI)
  }

  it("dibuja cuadrados") {
    assert(graficador.dibujar(Cuadrado(2)) == "un Cuadrado")
  }

  it("dibuja círculos de radio 1") {
    assert(graficador.dibujar(Circulo(1)) == "un Circulo")
  }

  it("dibuja círculos especiales") {
    assert(graficador.dibujar(Circulo(2)) == "un Circulo especial")
    assert(graficador.dibujar(Circulo(3)) == "un Circulo especial")
  }

  it("dibuja círculos comunes") {
    assert(graficador.dibujar(Circulo(4)) == "un Circulo de diametro 8.0")
  }
}
