//19001207
object Q3 extends App{

  val a1 = new Account("997682521V", 1952, 5000)
  val a2 = new Account("996602222V", 2051, 1000)

  println("\nBefore Transfer: \n Account1 - " + a1 + "\n Account2 - " + a2)

  a1.transfer(a2,2000)

  println("After Transfer: \n Account1 - " + a1 + "\n Account2 - " + a2 + "\n")

}

class Account (id: String, n: Int, b: Double){
  val nic : String = id
  val accnum : Int = n
  var balance : Double = b

  override def toString = "[" + nic + " : " + accnum + " : Rs " + f"$balance%1.2f" + "]"

  def withdraw(a : Double) = this.balance = this.balance-a

  def deposit(a : Double) = this.balance = this.balance + a

  def transfer(a : Account, b : Double) = {
    this.withdraw(b);
    a.deposit(b);
  }

}
