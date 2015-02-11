/**
 * Created by sergio on 11/02/15.
 */

case class Rational(numerator:Int, denominator:Int) {

  def + (other:Rational) = {
    val dMul = denominator * other.denominator
    val fact1 = numerator * other.denominator
    val fact2 = other.numerator * denominator
    val factorSum = fact1 + fact2
    val gcd = Rational.gcd(factorSum, dMul)

    if (factorSum == 0)
      Rational(0,1)
    else
      Rational((factorSum)/gcd, dMul/gcd)
  }

  def * (other:Rational) = {
    val dMul = denominator * other.denominator
    val nMul = numerator * other.numerator
    val gcd = Rational.gcd(nMul, dMul)
    val res = Rational(nMul/gcd, dMul/gcd)

    res match {
      case Rational(0,_) => Rational(0,1)
      case _ => res
    }

  }
}

//companion object
object Rational {
  def gcd (a:Int, b:Int):Int = if (b == 0) a else gcd(b, a % b)
}

