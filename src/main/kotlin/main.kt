import com.damoniy.laughingcoffingbank.Bank
import com.damoniy.laughingcoffingbank.account.Account
import com.damoniy.laughingcoffingbank.account.SavingsAccount
import com.damoniy.laughingcoffingbank.account.BusinessAccount
import com.damoniy.laughingcoffingbank.client.Client

fun main() {
    val venilton = Client()
    venilton.name = "Venilton"
    val businessAccount: Account = SavingsAccount(venilton)
    val savingsAccount: Account = BusinessAccount(venilton)

    Bank.registerAccount(businessAccount, savingsAccount)

    businessAccount.deposit(100.0)
    businessAccount.transfer(100.0).to(10000002)
    businessAccount.printExtract()
    savingsAccount.printExtract()
}