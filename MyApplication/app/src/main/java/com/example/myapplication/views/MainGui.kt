package com.example.myapplication.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import com.example.myapplication.MainGuiViewModels

@Composable
fun MainGui(viewModel: ViewModel){
    Column{
        Text(text="")
        Text(text="")
        Text(text="")
        Text(text="")
        WidgetTextField(viewModel)
        WidgetButton(viewModel)

    }

}