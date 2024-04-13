package com.example.bankaccountapp

class BankAccountClass(val accountHolder: String,
                       var balance: Double) {
    // private will not be accessed by the user
    private val transactionHistory = mutableListOf<String>()





    fun deposit(amount :Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount ")
        println("current $$balance")

    }

    fun withdraw(amount: Double){
        if (amount<= balance){
            println("you can withdraw money")
            balance-=amount
            transactionHistory.add("$accountHolder withdrew $$amount ")
            println("remaining $$balance")
        }else{
            println("not enough balance")
        }

    }
    
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for (history in transactionHistory){
            println(history)
        }


    }


    fun accBalance(balance: Double){
        println("final $balance")

    }

}