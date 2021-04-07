package com.example.tart.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Profile (navController: NavController) {
    Column(Modifier
        .fillMaxWidth()
        .fillMaxHeight()

    ) {
        Text(
            text = "Welcome",
            modifier = Modifier.padding(bottom = 5.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "You just learnt Navigation with Compose.",
            textAlign = TextAlign.Center
        )
    }
}
