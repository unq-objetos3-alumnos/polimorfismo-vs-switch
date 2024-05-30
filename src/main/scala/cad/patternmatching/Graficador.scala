package cad.patternmatching

class Graficador {
  def graficarEnSvg(figura: Figura): String = {
    figura match {
      case Circulo(1) => s"<circle />"
      case Circulo(x) => s"<circle radius=${x} />"
      case Cuadrado(lado) => s"<square side=${lado} />"
    }
  }
}
