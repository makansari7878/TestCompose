package com.ansari.demoprojectone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ansari.demoprojectone.ui.theme.DemoProjectOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // Greeting(name = "Ansari")
            Box (contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(color = Color.Green)
                    .height(300.dp)
                    .fillMaxSize()

            ) {

            }
            Spacer(modifier = Modifier.height(20.dp))
            Box (contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(color = Color.Red)
                    .height(300.dp)
                    .fillMaxSize()

            ) {

            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Column(
            modifier
                .background(color = Color.Cyan)
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(  text = "Hello $name!",)
            Spacer(modifier = Modifier.height(30.dp))
            myCustomText()
            Spacer(modifier = Modifier.height(30.dp))
            myImage()

        }

    }
    @Composable
    fun myCustomText(){
        Text(
            text = "Welcome to custom Android",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .clickable {
                    // Handle click action here
                }
                .background(Color.Green)
                .width(400.dp)
                .height(100.dp)
                .padding(5.dp)
        )
    }

    @Composable
    fun myImage(){
            var newImage = painterResource(id = R.drawable.koc)
        Image(painter = newImage,
            contentDescription ="this is my logo",
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
                .padding(10.dp))
    }
}