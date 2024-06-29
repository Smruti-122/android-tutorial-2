class BankAccount(private val accountNumber: String, private var balance: Double) {

    fun deposit(amt: Double) {
        if (amt> 0) {
            balance += amt
            println("Deposited $amt. New balance: $balance")
        } else {
            println("Invalid deposit amt. Amount must be positive.")
        }
    }

    fun withdraw(amt: Double) {
        if (amt > 0 && amt <= balance) {
            balance -= amt
            println("Withdrawn $amt. New balance: $balance")
        } else {
            println("Invalid withdrawal amount or insufficient balance.")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("123456789", 1000.0)
    println("Initial balance: ${account.getBalance()}")

    account.deposit(650.0)
    account.withdraw(200.0)
    account.withdraw(150.0) 

    println("Current balance: ${account.getBalance()}")
}
