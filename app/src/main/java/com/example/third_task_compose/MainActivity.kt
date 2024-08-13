package com.example.third_task_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondtask.AppBar
import com.example.third_task_compose.ui.theme.Third_task_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Third_task_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirdScreen("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirdScreen(name: String, modifier: Modifier = Modifier) {
    AppBar("Github Repositories")
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize().padding(top = 150.dp)
        ){
            Image(painter = painterResource(id = R.drawable.photo_removebg_preview), contentDescription = "photo_Logo",
                modifier = Modifier
                    .size(400.dp)
                    )

            Text(text = sample.title, fontWeight = FontWeight.Bold, fontSize = 22.sp)
            Text(text = sample.status, fontSize = 18.sp, color = Color.Gray, modifier = Modifier.padding(top = 10.dp))
            Box(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .width(300.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .border(BorderStroke(3.dp, Color(0xFF4CAF50))),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "RETRY",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF4CAF50),
                )
            }



        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Third_task_composeTheme {
        ThirdScreen("Android")
    }
}