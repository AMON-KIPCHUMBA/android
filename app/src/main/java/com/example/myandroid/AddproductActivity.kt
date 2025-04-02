package com.example.myandroid

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myandroid.ui.theme.MyandroidTheme

class AddproductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyandroidTheme {
                AddproductScreen()
            }
        }
    }
}

@Composable
fun AddproductScreen(){
    var imageUri = rememberSaveable() { mutableStateOf<Uri?>(value = null) }
    var launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent())
    {uri:Uri? -> uri?.let{imageUri.value=it} }
    Column {
        Card {
            AsyncImage(model = imageUri.value ?:R.drawable.ic_person,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(200.dp)
                    .clickable { launcher.launch("image/*") })
        }
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddproductScreenPreview(){
    AddproductScreen()
}