package com.damoniy.laughingcoffingbank.account

interface IAccount {
    fun withdraw(value: Double)
    fun deposit(value: Double)
    fun transfer(value: Double): IAccount
    fun printExtract()
    fun to(account: IAccount): IAccount
    fun to(accountId: Long): IAccount
}