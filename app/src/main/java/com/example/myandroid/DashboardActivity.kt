package com.example.myandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myandroid.ui.theme.MyandroidTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyandroidTheme {
                DashboardScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(){
    Box(){
        Image(painter = painterResource(id = R.drawable.background),
            contentDescription = "Dashboard background image",
            contentScale = ContentScale.FillBounds)
    }
    Column (modifier = Modifier.fillMaxSize().background(Color.Black), horizontalAlignment = Alignment.CenterHorizontally){
        TopAppBar(
            title = { Text(text = "SpringField ") }, navigationIcon = {
                IconButton(onClick = {}){
                    Icon(imageVector = Icons.Filled.Home,
                        contentDescription = "Home") } },
            actions = {
                IconButton(onClick = {}){
                    Icon(Icons.Filled.Person,
                        contentDescription = "Profile") }
                IconButton(onClick ={} ) {
                    Icon(Icons.Filled.Search,
                        contentDescription = "Search")
                }
                IconButton(onClick ={} ) {
                    Icon(Icons.Filled.Menu,
                        contentDescription = "Menu")
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Black,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White)
        )
        Row (modifier = Modifier.wrapContentWidth()){
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)
            ){
                Box (modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center){ Text(text = "Products") }
            }
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center){  Text(text = "Orders") }
            }
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)) {
                Box(
                    modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center
                ) { Text(text = "Payment") }
            }
        }
        Row (modifier = Modifier.wrapContentWidth()){
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)
            ){
                Box (modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center){ Text(text = "Settings") }
            }
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)){
                Box(modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center){  Text(text = "Shipping") }
            }
            Card (modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.White)) {
                Box(
                    modifier = Modifier.height(100.dp).padding(25.dp),
                    contentAlignment = Alignment.Center
                ) { Text(text = "Reports") }
            }
        }
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen()

}