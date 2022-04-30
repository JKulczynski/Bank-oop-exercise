import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class AccountSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Account"

  it should "Allow to make deposit" in {
    val acc1 = Account(balance, 3172)
    val balance = 1000
    val amount = 100
    val actual = acc1.deposit(amount)
    val expected = balance + amount
    actual shouldBe expected
  }

  it should "Allow to make withdraw" in {
    val acc1 = Account(balance, 3172)
    val balance = 1000
    val amount = 100
    val actual = acc1.withdraw(amount)
    val expected = balance - amount
    actual shouldBe expected
  }

  it should "Allow to close account" in {
    val acc1 = Account(1000, 3172)
    val actual = acc1.close
    val expected = 0
    actual shouldBe expected
  }

}
