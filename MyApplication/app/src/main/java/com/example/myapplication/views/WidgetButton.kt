package com.example.myapplication.views

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.myapplication.MainGuiViewModels


@Composable
fun WidgetButton(viewModel: ViewModel){
    Button(onClick = {
        MainGuiViewModels.incrementaContador();
    }) {
        Text(text = "Quantidade de clicks" + MainGuiViewModels.obterContador)
    }
}