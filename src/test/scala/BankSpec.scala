import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class BankSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Bank"
  it should "Allow to transfer money between two accounts" in {
    val acc1 = Account(balance1, 1283)
    val balance1 = 10000
    val acc2 = Account(balance2, 2738)
    val balance2 = 5000
    val bank = new Bank
    val transfer = bank.transfer(acc1, acc2, 500)
    val acctual = transfer
    val expected = balance1 + 500
    acctual shouldBe expected
  }
}
