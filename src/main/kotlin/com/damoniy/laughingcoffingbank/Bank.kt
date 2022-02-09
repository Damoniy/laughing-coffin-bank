package com.damoniy.laughingcoffingbank

import com.damoniy.laughingcoffingbank.account.Account

object Bank {
    val defaultAgency = 1
    val name: String = "Laughing Coffin Bank"
    val accounts: HashMap<Long, Account> = HashMap()

    fun registerAccount(vararg account: Account) {
        for(acc in account) {
            accounts[acc.number] = acc
        }
    }
}