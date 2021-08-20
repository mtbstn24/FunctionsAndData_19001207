//19001207
object Q1 extends App{

  val x = new Rational(10,25)

  println("\n Negation of "+ x.toString + " : " + x.neg + "\n")

}

class Rational(x : Int, y : Int){
  require (y>0, "Denominator should be positive")
  private def gcd(a : Int, b : Int): Int = if(b == 0) a else gcd(b,a%b)
  private val g = gcd(Math.abs(x),y)
  def numer = x/g
  def denom = y/g

  def neg = new Rational(- this.numer, this.denom)

  override def toString = numer + "/" + denom
}
