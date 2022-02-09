package com.damoniy.laughingcoffingbank.account

import com.damoniy.laughingcoffingbank.client.Client

class SavingsAccount(client: Client) : Account(client) {
    override fun printExtract() {
        println("=== Business Account Extract ===${this}")
    }
}