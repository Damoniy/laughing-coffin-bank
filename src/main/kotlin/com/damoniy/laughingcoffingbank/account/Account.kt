package com.damoniy.laughingcoffingbank.account

import com.damoniy.laughingcoffingbank.Bank
import com.damoniy.laughingcoffingbank.client.Client

abstract class Account(private val client: Client) : IAccount {

    private var lastTransactionalValue = 0.0

    val agency: Int = Bank.defaultAgency
    val number: Long = AccountsNumberHelper.generateNumber()

    var balance = 0.0
        protected set

    override fun withdraw(value: Double) {
        balance -= value
    }

    override fun deposit(value: Double) {
        balance += value
    }

    override fun transfer(value: Double): IAccount {
        if(canTransfer()) this.lastTransactionalValue = value
        return this
    }

    override fun to(account: IAccount): IAccount {
        withdraw(lastTransactionalValue)
        account.deposit(lastTransactionalValue)
        return this
    }

    override fun to(accountId: Long): IAccount {
        withdraw(lastTransactionalValue)
        Bank.accounts[accountId]?.deposit(lastTransactionalValue)
        return this
    }

    override fun toString(): String {
        return "\nHolder: ${client.name}\nAgency: $agency\nNumber: $number\nBalance: $balance\n"
    }

    fun canTransfer() = balance > 0.0
}