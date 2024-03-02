package com.kalex.myadviceapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel

/**
 * @author kevin-soto Alexander Soto on 24/02/24
 * **/

@Composable
fun MainAdvice(
    viewModel: AdviceViewModel = koinViewModel()
){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        Text(text = viewModel.advice.collectAsState().value)
        Button(onClick = {
            viewModel.getNewAdvice()
        }) {
            Text(text = "Get Advice")

        }

    }

}