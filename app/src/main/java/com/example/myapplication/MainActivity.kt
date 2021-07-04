package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ) {
                var showParticles by remember { mutableStateOf(false) }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Particles(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp),
                        quantity = 22,
                        emoji = "\uD83D\uDD25",
                        visible = showParticles
                    )

                    Spacer(modifier = Modifier.size(100.dp))

                    Button(
                        onClick = { showParticles = !showParticles }) {
                    }
                }
            }
        }
    }
}