//19001207
object Q2 extends App{

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println("\n x = " + x.toString)
  println(" y = " + y.toString)
  println(" z = " + z)
  println(" x - y - z = " + (x-y-z) + "\n")

}

class Rational(x : Int, y : Int){
  require (y>0, "Denominator should be positive")
  private def gcd(a : Int, b : Int): Int = if(b == 0) a else gcd(b,a%b)
  private val g = gcd(Math.abs(x),y)
  def numer = x/g
  def denom = y/g

  override def toString = numer + "/" + denom

  def neg = new Rational(- this.numer, this.denom)

  def + (r : Rational) = new Rational (this.numer * r.denom + r.numer * this.denom, denom * r.denom)

  def - (r : Rational) = this + r.neg

}
