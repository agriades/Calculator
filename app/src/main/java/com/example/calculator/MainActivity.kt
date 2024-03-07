package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculator = Calculator() // 계산기 불러와! Calculator 클래스의 인스턴스 생성

        var currentResult: Float = 0f
        var answer: Float = 0f
        var isItOkay: Boolean = true


        while (isItOkay) {
            //입력값 받기
            println("숫자 입력: ")
            val currentInput = readLine()!!.toFloat()
            print("연산자를 입력하세요: 더하기(+), 빼기(-), 곱하기(*), 나누기(/): ")
            val operation = readLine()

            when (operation) {
                "더하기", "+" -> answer = calculator.add(currentResult, currentInput)
                "빼기", "-" -> answer = calculator.subtract(currentResult, currentInput)
                "곱하기", "*" -> answer = calculator.multiply(currentResult, currentInput)
                "나누기", "/" -> answer = calculator.divide(currentResult, currentInput)
                else -> isItOkay = false
            }

            println("지금까지 계산한 결과는 ${answer}입니다.")
            currentResult = answer
        }
    }
}