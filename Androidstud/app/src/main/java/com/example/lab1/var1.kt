package com.example.lab1

fun main() {
    var isValidInput: Boolean

    while (true) {

        var num1: Double? = null
        isValidInput = false
        while (!isValidInput) {
            print("Введіть перше число: ")
            val input1 = readLine()
            num1 = input1?.toDoubleOrNull()
            if (num1 != null) {
                isValidInput = true
            } else {
                println("Помилка! Ви повинні ввести дійсне число.")
            }
        }


        var operation: String? = null
        isValidInput = false
        while (!isValidInput) {
            print("Введіть операцію (+, -, *, /): ")
            operation = readLine()
            if (operation in listOf("+", "-", "*", "/")) {
                isValidInput = true
            } else {
                println("Помилка! Введіть одну з допустимих операцій: +, -, *, /.")
            }
        }


        var num2: Double? = null
        isValidInput = false
        while (!isValidInput) {
            print("Введіть друге число: ")
            val input2 = readLine()
            num2 = input2?.toDoubleOrNull()
            if (num2 != null) {
                isValidInput = true
            } else {
                println("Помилка! Ви повинні ввести дійсне число.")
            }
        }

        if (operation != null && num1 != null && num2 != null) {
            val result = when (operation) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> if (num2 != 0.0) num1 / num2 else {
                    println("Помилка! Ділення на нуль неможливе.")
                    null
                }
                else -> null
            }

            if (result != null) {
                println("Результат: $num1 $operation $num2 = $result")
            }
        }
    }
}
