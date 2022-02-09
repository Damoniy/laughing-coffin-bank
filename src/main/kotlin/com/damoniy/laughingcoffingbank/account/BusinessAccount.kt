package com.damoniy.laughingcoffingbank.account

import com.damoniy.laughingcoffingbank.client.Client

class BusinessAccount(client: Client) : Account(client) {
    override fun printExtract() {
        println("=== Savings Account Extract ===${this}")
    }
}