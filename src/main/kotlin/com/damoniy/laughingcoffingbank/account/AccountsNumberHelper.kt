package com.damoniy.laughingcoffingbank.account

object AccountsNumberHelper {
    private var number = 0L

    fun generateNumber(): Long {
        return 10000000L.plus(++number)
    }
}