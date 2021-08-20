//19001207
import scala.collection._

object Q4 extends App {

  val a1 = new Account("997682521V", 1952, 5000)
  val a2 = new Account("996602222V", 2051, 1000)
  val a3 = new Account("987082500V", 3001, -100)
  val a4 = new Account("906601004V", 1850, 1200)
  val a5 = new Account("897600506V", 2121, -3500)
  val a6 = new Account("636604444V", 1805, 25000)

  var bank : List[Account] = List(a1,a2,a3,a4,a5,a6)

  val overdraft = (b : List[Account]) => b.filter(x => x.balance < 0)

  val total = (b: List[Account]) =>
    b.map(x => x.balance).reduce((x,y) => x + y)

  val interest = (b : List[Account]) =>
    b.map(x => if(x.balance < 0) x.balance + x.balance * 0.1 else x.balance + x.balance * 0.05)

  println("\nAccounts with Negative Balances: \n" + overdraft(bank) )
  val t = total(bank)
  println("\nTotal Balance of all Accounts: " + "Rs " + f"$t%1.2f" )
  println("\nFinal Account Balances with Interest : \n" + interest(bank) + "\n")

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
