package cad.patternmatching

class Graficador {
  def dibujar(figura: Figura) = figura match {
    case Circulo(1) => "un Circulo"
    case Circulo(radio) if radio >= 2 && radio <= 3 => "un Circulo especial"
    case CirculoConDiametro(diametro) => "un Circulo de diametro " + diametro
    case Cuadrado(_) => "un Cuadrado"
  }
}

object CirculoConDiametro {
  def unapply(figura: Figura): Option[Double] = figura match {
    case circulo@Circulo(_) => Some(circulo.diametro)
    case _ => None
  }
}
