package com.example.tart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tart.ui.theme.TartTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TartTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun Greeting() {

    var isOpen = remember { mutableStateOf(false) }

    Column(modifier = Modifier
        .padding(4.dp)
        .fillMaxHeight()
    ){
        Image(painter = painterResource(id = R.drawable.upper_image),
            contentDescription = "Cod Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(shape = MaterialTheme.shapes.medium)
        )

            AnimatedVisibility(visible = isOpen.value) {
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Welcome to Call of Duty.",
                        style = MaterialTheme.typography.h5,
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif
                    )
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(
                        text = "Version 2.3.00.1",
                        color = Color.DarkGray,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }


        Button(onClick = { isOpen.value = !isOpen.value }) {
            Text(text = "Click")
        }

    }
}

@ExperimentalAnimationApi
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    TartTheme (darkTheme = true){
        Greeting()
    }
}