package cad.patternmatching

case class Cuadrado(lado: Double) extends Figura {
  override val area = lado * lado

  override val perimetro = 4 * lado
}
