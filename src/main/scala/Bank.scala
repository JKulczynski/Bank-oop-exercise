class Bank {

  def openAccount = println("Your account has been open")

  def transfer(Account1: Account, Account2: Account, amount: Int) = {
    if (amount <= Account1.balance) Account1.balance - amount & Account2.balance + amount
    else println("You can't transfer such amount")
  }
}
