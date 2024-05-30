package cad.patternmatching

sealed trait Figura {
  val area: Double

  val perimetro: Double
}

case class Circulo(var radio: Int) extends Figura {
  override val area: Double = Math.PI * radio * radio

  override val perimetro: Double = 2 * Math.PI * radio
}

case class Cuadrado(lado: Double) extends Figura {
  override val area: Double = lado * lado

  override val perimetro: Double = 4 * lado
}
