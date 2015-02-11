import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by sergio on 11/02/15.
 */
class RationalSpec extends FlatSpec with Matchers{
  "rational add" should "allow creation" in {
    Rational(0,1) + Rational(0,1) should be (Rational(0,1))
  }

  it should "add 0 plus 1" in {
    Rational(0,1) + Rational(1,1) should be (Rational(1,1))
  }

  it should "add 1 plus 1" in {
    Rational(1,1) + Rational(1,1) should be (Rational(2,1))
  }

  it should "add 1/2 plus 1/3" in {
    Rational(1,2) + Rational(1,3) should be (Rational(5,6))
  }

  it should "add 1/5 plus 2/5" in {
    Rational(1,5) + Rational(2,5) should be (Rational(3,5))
  }

  it should "add 1/2 plus 1/2" in {
    Rational(1,2) + Rational(1,2) should be (Rational(1,1))
  }

  it should "represent 0 as 0/1" in {
    Rational(1,5) + Rational(1,-5) should be (Rational(0,1))
  }

  "rational mul" should "multiply 2 rationals" in {
    Rational(1,2) * Rational(1,2) should be (Rational(1,4))
  }


  "gcd" should "find common divisor" in {
    Rational.gcd(15,25) should be (5)
  }



}
