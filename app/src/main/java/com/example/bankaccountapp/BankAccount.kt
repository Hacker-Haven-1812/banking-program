package com.example.bankaccountapp

fun main(){
    val ankushBankAccount = BankAccountClass(accountHolder = "ankush kumar jaiswal" , balance = 999.0)
    ankushBankAccount.deposit(621.0)
    ankushBankAccount.displayTransactionHistory()
    ankushBankAccount.withdraw(500.0)
    ankushBankAccount.displayTransactionHistory()
    ankushBankAccount.withdraw(200.0)
    ankushBankAccount.deposit(10000.011)
    println(" ${ankushBankAccount.accountHolder} your balance is ${ankushBankAccount.balance}")
    //ankushBankAccount.accBalance()
    val sharaBankAccount = BankAccountClass(accountHolder = "sahara" , balance = 99900.0)
    sharaBankAccount.deposit(2222.0)
    sharaBankAccount.deposit(1000.00)
    sharaBankAccount.displayTransactionHistory()
    sharaBankAccount.withdraw(5000.0)
    //sharaBankAccount.accBalance()

}
