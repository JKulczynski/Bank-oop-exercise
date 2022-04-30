object BankApp extends App {

  val bank = new Bank

  val acc1 = Account(100000, 23564)
  val depo = acc1.deposit(1000)
  val acc2 = Account(400000, 876576)
  val width = acc2.withdraw(50000)

  bank.transfer(acc1, acc2, 600)

  acc1.close
  acc2.statment


}
