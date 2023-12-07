package com.example.myapplication.classcal

class MulOp : AbsOp() {
    override fun operate(first: Double, second: Double): Double {
        val answer= first * second
        return answer
    }
}