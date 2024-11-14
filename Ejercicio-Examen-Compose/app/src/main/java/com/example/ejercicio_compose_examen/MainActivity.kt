package com.example.ejercicio_compose_examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio_compose_examen.ui.theme.EjercicioComposeExamenTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var size: MutableState<String> =  mutableStateOf("65");
        enableEdgeToEdge()
        setContent {
            EjercicioComposeExamenTheme {
                Ejercicio(size)
            }
        }
    }
}

@Composable
fun Ejercicio(size: MutableState<String>) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .width(330.dp)
            .height(150.dp)
            .background(Color.Gray)) {
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxHeight().padding(bottom = 40.dp)) {
                Text(text = "Hello Android!!", Modifier.background(Color.Red))
            }
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Hello Android!!", Modifier.background(Color.Red))
                Text(text = "Hello Android!!", Modifier.background(Color.Red))
                Text(text = "Hello Android!!", Modifier.background(Color.Red))
            }
        }
        Row(
            modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .background(Color.White),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hola Android")
        }
        Row(
            Modifier
                .background(Color.Green)
                .width(330.dp)
                .height(200.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                Modifier
                    .background(Color.Blue)
                    .fillMaxHeight()
                    .width(60.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "1")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "2")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "3")
                }

            }
            Column(
                Modifier
                    .background(Color.Magenta)
                    .fillMaxHeight()
                    .width(150.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "4")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "5")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "6")
                }
            }
            Column(
                Modifier
                    .background(Color.Black)
                    .fillMaxHeight()
                    .width(60.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "7")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "8")
                }
                Button(onClick = {size.value = "60"}, Modifier.size(Integer.valueOf(size.value).dp)) {
                    Text(text = "9")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {


}