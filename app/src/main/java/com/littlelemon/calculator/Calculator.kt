package com.littlelemon.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.calculator.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    onAction:(CalculatorActions)->Unit,
    buttonSpacing: Dp=8.dp,
    modifier: Modifier=Modifier
){
    Box(modifier = modifier){
        Column(
            modifier= Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter),
          verticalArrangement=Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text =state.number1+(state.operation?.symbol?:"")+state.number2,
                textAlign = TextAlign.End,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Divide))
                    }
                )
            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Multiply))
                    }
                )
            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Subtract))
                    }
                )
            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Add))
                    }
                )
            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}
