package com.example.applicationswithcompose.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.applicationswithcompose.Routes

@Composable
fun ScreenMain(navController: NavController){
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            navController.navigate(Routes.screenCounter)
        }) {
            Text(text = "Contador App")
            }

        Button(onClick = {
            navController.navigate(Routes.screenInputName)
        }) {
            Text(text = "Listado de Nombres")
        }
    }
}