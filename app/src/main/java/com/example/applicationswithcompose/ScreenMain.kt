package com.example.applicationswithcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.applicationswithcompose.Routes

@Composable
fun ScreenMain(navController: NavController){
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        //Boton de Contador
        Button(
            onClick = { navController.navigate(Routes.screenCounter) },
            modifier = Modifier.fillMaxWidth(0.5f)
            ) {
            Text(text = "Contador App")
            }

        //Boton de Lista de Nombres
        Button(
            onClick = { navController.navigate(Routes.screenInputName)},
            modifier = Modifier.fillMaxWidth(0.5f)
            ) {
            Text(text = "Listado de Nombres")
        }

        //Boton de IMC
        Button(
            onClick = { navController.navigate(Routes.screenImc)},
            modifier = Modifier.fillMaxWidth(0.5f))
        {
            Text(text = "Calculadora IMC")
        }

        //Boton de SuperHeroApp
        Button(
            onClick = { navController.navigate(Routes.screenSuperHeroApp)},
            modifier = Modifier.fillMaxWidth(0.5f))
        {
            Text(text = "SuperHero App (API)" )
        }

    }
}

@Preview
@Composable
fun ScreenMainPreview(){
    val navController = rememberNavController()
    ScreenMain(navController)
}