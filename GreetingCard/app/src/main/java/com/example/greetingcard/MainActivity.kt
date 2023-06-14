package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                GreetingsScreen(greetingName = "Android", greetingDragName = "moving Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center) {
        Surface(modifier = modifier, color = Color.Black) {
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = "Hello $name!\nIt's raining heavily now!",
                    modifier = modifier.padding(36.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 24.sp,
                    color = Color.Magenta
                )
                Text(
                    text = "Hello Same Drag $name!\nIt's raining heavily now!",
                    modifier = modifier.padding(36.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 24.sp,
                    color = Color.Magenta
                )
            }
        }
    }
}

@Composable
fun GreetingDrag(name: String, modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center) {
        Surface(modifier = modifier, color = Color.Black ) {
            Text(
                text = "Hello Drag $name!\nIt's raining heavily now!",
                modifier = modifier.padding(36.dp),
                fontFamily = FontFamily.SansSerif,
                fontSize = 24.sp,
                color = Color.Magenta
            )
        }
    }
}

@Composable
fun GreetingsScreen(greetingName: String, greetingDragName: String) {
    Column(modifier = Modifier.fillMaxSize().background(Color.White), verticalArrangement = Arrangement.Center) {
        Greeting(name = greetingName)
        Greeting(name = greetingDragName)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        GreetingsScreen(greetingName = "Android", greetingDragName = "moving Android")
    }
}