// Task 15.2.3: demo program

fun main() {
    val account = SavingsAccount(1.8, "Harry Hopkinson");
    account.deposit(1250);

    account.applyInterest();
    account.applyInterest();
    account.applyInterest();
    account.applyInterest();
    account.applyInterest();

    account.withdraw(50);
    println(account.balance);
}
