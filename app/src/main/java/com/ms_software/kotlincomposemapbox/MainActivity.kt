package com.ms_software.kotlincomposemapbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ms_software.kotlincomposemapbox.ui.theme.KotlinComposeMapboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinComposeMapboxTheme {
                MapScreen()
            }
    }
}


@Preview(showBackground = true)
@Composable
fun MapboxPreview() {
    KotlinComposeMapboxTheme {
        MapScreen()
        }
    }
}