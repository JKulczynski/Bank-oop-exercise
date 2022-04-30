case class Account(balance: Int, num: Int) {
  def deposit(amoutn: Int): Int = balance + amoutn

  def withdraw(amount: Int) = {
    if (amount <= balance) balance - amount
    else "Not enough balance"
  }

  def statment = println(s"You have:$balance on your account, Account number:$num")

  def close = {
    withdraw(balance)
  }
}
