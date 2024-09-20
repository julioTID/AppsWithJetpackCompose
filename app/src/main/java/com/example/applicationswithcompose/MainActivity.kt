package com.example.applicationswithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //Creamos el navController
            val navController = rememberNavController()

            //Declaramos el navHost
            NavHost(navController = navController, startDestination = "screen_main" , builder = {

                //--Definimos las pantallas

                    //Pantalla principal
                composable(Routes.screenMain){
                    ScreenMain(navController)
                }
                composable(Routes.screenCounter){
                    Counter()
                }
                composable(Routes.screenInputName){
                    TextFieldWithLazyColumn()
                }

                composable(Routes.screenImc){
                    ScreenImc()
                }
            })
        }
    }
}