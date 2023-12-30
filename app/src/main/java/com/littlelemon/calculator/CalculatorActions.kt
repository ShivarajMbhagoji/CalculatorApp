package com.littlelemon.calculator

sealed class CalculatorActions{
    data class Number(val number:Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Decimal: CalculatorActions()
    object Delete: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation:CalculatorOperations): CalculatorActions()
}

