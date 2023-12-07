package com.example.myapplication.classcal

class MinOp : AbsOp() {
    override fun operate(first: Double, second: Double): Double {
        val answer = first - second
        return answer
    }
}