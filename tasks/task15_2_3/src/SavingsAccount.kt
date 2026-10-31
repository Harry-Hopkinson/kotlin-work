// Task 15.2.3: SavingsAccount class
class SavingsAccount(val rate: Double, holder: String): BankAccount(holder) {
    init {
        require(rate > 0) { "Interest rate must be greater than 0" }
    }

    fun applyInterest() {
        val interest = balance * rate / 100
        deposit(interest.toInt())
    }
}
