package com.aulascom.exerciciowireframe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aulascom.exerciciowireframe.ui.theme.ExercicioWireframeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicioWireframeTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                   StartScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun StartScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "SCORE: 0050",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "LIVES:",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                IconAndroid(modifier = Modifier.size(32.dp), color = Color.Green)
                IconAndroid(modifier = Modifier.size(32.dp), color = Color.Green)
                IconAndroid(modifier = Modifier.size(32.dp), color = Color.Green)
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            IconAndroid(modifier = Modifier.size(85.dp), color = Color.Green)
            IconAndroid(modifier = Modifier.size(85.dp), color = Color.Red)
            IconAndroid(modifier = Modifier.size(85.dp), color = Color.Blue)
            IconAndroid(modifier = Modifier.size(85.dp), color = Color.Yellow)
            IconAndroid(modifier = Modifier.size(85.dp), color = Color.Green)
        }

    }
}

@Composable
fun IconAndroid(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Icon Android",
        colorFilter = ColorFilter.tint(color)
    )
}