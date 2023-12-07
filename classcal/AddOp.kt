package com.example.myapplication.classcal

class AddOp : AbsOp() {
    override fun operate(first: Double, second: Double): Double {
        val answer = first + second
        return answer
    }
}