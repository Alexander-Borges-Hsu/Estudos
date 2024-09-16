package com.example.myapplication.views

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel

@Composable
fun WidgetTextField(viewModel: ViewModel){
    TextField(value = "", onValueChange = {})
}