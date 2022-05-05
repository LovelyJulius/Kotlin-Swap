package io.github.lovelyjulius.kotlinswap

import java.util.*

class KotlinSwap {
    /**
     * 用途:交换值并输出
     */
    fun swap(a: String, b: String) {
        var a = a
        var b = b
        val temp: String
        temp = a
        a = b
        b = temp
        println("a = $a")
        println("b = $b")
    }

    companion object {
        /**
         * Main方法
         */
        @JvmStatic
        fun main(args: Array<String>) {
            val KotlinSwap = KotlinSwap()
            val a: String
            val b: String
            val input = Scanner(System.`in`)
            a = input.next()
            b = input.next()
            KotlinSwap.swap(a, b)
        }
    }
}