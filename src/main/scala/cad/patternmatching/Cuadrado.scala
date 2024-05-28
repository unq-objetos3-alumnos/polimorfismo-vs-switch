package cad.patternmatching

class Cuadrado(lado: Double) extends Figura {
  override val area: Double = lado * lado

  override val perimetro: Double = 4 * lado
}
