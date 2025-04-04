package com.example.myandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.Brush
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

class MainActivity : ComponentActivity() {
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
    var firstname by remember { mutableStateOf(value = "") }
    var lastname by remember { mutableStateOf(value = "") }
    var email by remember { mutableStateOf(value = "") }
    var password by remember { mutableStateOf(value = "") }
    val context = LocalContext.current
    Column (modifier = Modifier.fillMaxHeight().fillMaxWidth().background(Color.Black), verticalArrangement = Arrangement.Center){
        Text(text = "Register Here !!",
            fontSize = 40.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Black)
                .padding(20.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(painter = painterResource(R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .height(100.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = firstname,
            onValueChange = {newFirstName -> firstname = newFirstName},
            label = {Text(text = "Enter First Name", color = Color.Gray)},
            placeholder = { Text(text = "Please enter firstname") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).border(1.dp, Color.Magenta, RoundedCornerShape(12.dp)))
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = lastname,
            onValueChange = {newLastName -> lastname = newLastName},
            label = { Text(text = "Enter Last Name", color = Color.Gray) },
            placeholder = { Text(text = "Please enter lastname") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).border(1.dp, Color.Magenta, RoundedCornerShape(12.dp)))
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = email,
            onValueChange = {newEmail -> email = newEmail},
            label = { Text(text = "Enter email", color = Color.Gray) },
            placeholder = { Text(text = "Please enter email") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).border(1.dp, Color.Magenta, RoundedCornerShape(12.dp)))
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password,
            onValueChange = {newPassword -> password = newPassword},
            label = { Text(text = "Enter Password", color = Color.Gray) },
            placeholder = { Text(text = "Please enter Password") },
            modifier = Modifier.wrapContentWidth().align(Alignment.CenterHorizontally).border(1.dp, Color.Magenta, RoundedCornerShape(12.dp)))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally), colors = ButtonDefaults.buttonColors(
            Color.Magenta)) {
            Text(text = "Register")
        }
        Text(text = buildAnnotatedString { append("If already registered, Login here ")  }, modifier = Modifier
            .wrapContentWidth()
            .align(Alignment.CenterHorizontally)
            .clickable {
                val intent = Intent(context,AddproductActivity
                ::class.java)
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


