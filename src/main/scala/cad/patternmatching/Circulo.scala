package cad.patternmatching

case class Circulo(var radio: Int) extends Figura {
  override val area: Double = Math.PI * radio * radio

  override val perimetro: Double = Math.PI * radio * 2

  val diametro = radio * 2
}
