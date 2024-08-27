package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }
}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier, // Аргумент модификатора гарантирует, что составные элементы в функции Column() соответствуют ограничениям, вызванным для экземпляра модификатора.
        horizontalAlignment = Alignment.CenterHorizontally, // Это гарантирует, что дочерние элементы внутри столбца будут центрированы на экране устройства по ширине.
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(stringResource(R.string.roll))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize() //заполняет все свободное пространство
        .wrapContentSize(Alignment.Center) //выстраивает компоненты внутри в рамках всего пространства
    )
}