package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_saudacao.R
import com.example.app_saudacao.ui.theme.App_saudacaoTheme
import com.example.app_saudacao.ui.theme.App_saudacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App_saudacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "3° Novotec Desenvolvimento de Sistemas",
                        from = "Revellin Mendes",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Box {
        val img = painterResource(R.drawable.teste)
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxSize()
        ) {
            Image(
                painter = img,
                contentDescription = null

            )
            Text(
                text = message,
                fontSize = 30.sp,
                lineHeight = 150.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(30.dp)
                    .align(alignment = Alignment.End)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun saudadcaoPreview() {
    App_saudacaoTheme {
        GreetingText(message = "3° Novotec Desenvolvimento de Sistemas", from = "Revellin Mendes")
    }
}