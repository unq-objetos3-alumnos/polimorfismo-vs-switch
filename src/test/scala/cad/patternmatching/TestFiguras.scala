package cad.patternmatching

import org.junit.Assert.assertEquals
import org.junit.Test

class TestFiguras {
  val medidor = new Medidor
  val graficador = new Graficador

  @Test
  def calculaElPerimetroDeCuadrados(): Unit = {
    assertEquals(8, medidor.perimetroDe(new Cuadrado(2)), 0.01)
  }

  @Test
  def calculaElPerimetroDeCirculos(): Unit = {
    assertEquals(4 * Math.PI, medidor.perimetroDe(new Circulo(4)), 0.01)
  }

  @Test
  def calculaElAreaDeCuadrados(): Unit = {
    assertEquals(4, medidor.areaDe(new Cuadrado(2)), 0.01)
  }

  @Test
  def calculaElAreaDeCirculos(): Unit = {
    assertEquals(4 * Math.PI, medidor.areaDe(new Circulo(4)), 0.01)
  }

  @Test
  def convierteCirculosASVG(): Unit = {
    assertEquals("<circle radius=2 />", graficador.graficarEnSvg(Circulo(4)))
  }

  @Test
  def convierteCuadradosASVG(): Unit = {
    assertEquals("<square side=1.0 />", graficador.graficarEnSvg(new Cuadrado(1)))
  }

  @Test
  def losCirculosDeRadio1NoTienenElAtributoRadio(): Unit = {
    assertEquals("<circle />", graficador.graficarEnSvg(new Circulo(2)))
  }
}
