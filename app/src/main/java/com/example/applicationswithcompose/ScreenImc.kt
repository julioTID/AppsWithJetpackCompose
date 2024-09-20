package com.example.applicationswithcompose

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Preview
@Composable
fun ScreenImc(){

    var altura by remember {
        mutableStateOf(170f)
    }

    var peso by remember {
        mutableStateOf(70)
    }

    var edad by remember {
        mutableStateOf(17)
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //Primer fila Géneros
        Row {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Título de la Tarjeta")
                    Text(text = "Contenido.")
                }
            }

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Tarjeta numero 2")
                    Text(text = "Contenido.")
                }
            }
        }

        //Segunda fila Altura

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Altura")
                    Text(text = "172")
                    Slider(
                        value = altura,
                        onValueChange = {
                            nuevoValor -> altura = nuevoValor
                        },
                        valueRange = 100f..220f,
                        steps = 1
                        )
                }
            }

        //Tercera Fila - Peso y Edad
        Row{

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Peso")
                    Text(text = "50")

                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text("+")
                        }
                        Button(onClick = { /*TODO*/ }) {
                            Text("-")
                        }
                    }
                }

            }

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Edad")
                    Text(text = "22")
                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text("+")
                        }
                        Button(onClick = { /*TODO*/ }) {
                            Text("-")
                        }
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.Center

        ){
            Button(onClick = { /*TODO*/ }) {
                Text("CALCULAR")
            }
        }

        
    }
}