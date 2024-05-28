package cad.patternmatching

class Circulo(var radio: Int) extends Figura {
  override val area: Double = Math.PI * radio * radio

  override val perimetro: Double = Math.PI * radio * 2

  val diametro: Int = radio * 2
}
