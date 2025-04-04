package com.example.myandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myandroid.ui.theme.MyandroidTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyandroidTheme {
                RegisterScreen()

            }
        }
    }
    @Composable
    fun RegisterScreen(){

        var email by remember { mutableStateOf(value = "") }
        var password by remember { mutableStateOf(value = "") }
        val context = LocalContext.current
        Column (modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.Black), verticalArrangement = Arrangement.Top){
            Text(text = "Welcome Back !!",
                fontSize = 40.sp,
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .background(Color.Black)
                    .padding(40.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(100.dp))
            Image(painter = painterResource(R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Spacer(modifier = Modifier.height(50.dp))
//
            OutlinedTextField(value = email,
                onValueChange = {newEmail -> email = newEmail},
                label = { Text(text = "Enter email") },
                placeholder = { Text(text = "Please enter email") },
                modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally))
            OutlinedTextField(value = password,
                onValueChange = {newPassword -> password = newPassword},
                label = { Text(text = "Enter Password") },
                placeholder = { Text(text = "Please enter Password") },
                modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally))
            Button(onClick = {}, modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(
                Color.DarkGray)) {
                Text(text = "Log in")
            }
            Text(text = buildAnnotatedString { append("Don't have an account ? Sign up now !! ")  }, modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
                .clickable {
                    val intent = Intent(context,LoginActivity::class.java)
                    context.startActivity(intent)
                })

        }

    }
    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun RegisterScreenPreview(){
        RegisterScreen()
    }
}
