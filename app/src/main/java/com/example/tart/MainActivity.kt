package com.example.tart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tart.presentation.Greeting
import com.example.tart.presentation.Profile
import com.example.tart.ui.theme.TartTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TartTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun Navigation(){

    //navigation state
    val navController = rememberNavController()

    NavHost(navController, startDestination = "greeting") {
        composable("greeting") { Greeting( navController ) }
        composable("profile") { Profile( navController ) }
    }

}




@ExperimentalAnimationApi
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    TartTheme (darkTheme = true){
        Navigation()
    }
}