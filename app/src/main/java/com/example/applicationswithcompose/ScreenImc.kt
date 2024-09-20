package com.example.applicationswithcompose

import android.inputmethodservice.Keyboard.Row
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource

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

    //True = Hombre, False = Mujer
    var genero by remember {
        mutableStateOf(true)
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //Primer fila Géneros
        Row {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                    .clickable(onClick = { genero = true }),
                colors = CardDefaults.cardColors(
                    containerColor = if(genero) colorScheme.primary else colorScheme.background
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_male), contentDescription = null)
                    Text(text = "Hombre")
                }
            }

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f)
                    .clickable(onClick = { genero = false }),
                colors = CardDefaults.cardColors(
                    containerColor = if(!genero) colorScheme.primary else colorScheme.background
                ),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_female), contentDescription = null)
                    Text(text = "Mujer")
                }
            }
        }

        //Segunda fila Altura

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(colorScheme.background)
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(text = "Altura")
                    Text(text = altura.toInt().toString() + "cm")
                    Slider(
                        value = altura,
                        onValueChange = {
                            nuevoValor -> altura = nuevoValor
                        },
                        valueRange = 120f..220f
                        )
                }
            }

        //Tercera Fila - Peso y Edad
        Row{

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(colorScheme.background)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Peso")
                    Text(text = peso.toString())

                    Row {
                        Button(onClick = { peso-- }) {
                            Icon(painter = painterResource(id = R.drawable.ic_remove), contentDescription = null)
                        }
                        Button(onClick = { peso++ }) {
                            Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = null)
                        }
                    }
                }
            }

            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                colors = CardDefaults.cardColors(colorScheme.background)
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Edad")
                    Text(text = edad.toString())
                    Row {
                        Button(onClick = { edad-- }) {
                            Icon(painter = painterResource(id = R.drawable.ic_remove), contentDescription = null)
                        }
                        Button(onClick = { edad++ }) {
                            Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = null)
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