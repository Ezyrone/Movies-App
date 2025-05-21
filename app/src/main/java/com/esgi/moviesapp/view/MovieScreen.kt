package com.esgi.moviesapp.view

import android.icu.text.CaseMap
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.lang.reflect.Modifier

@Composable
fun MovieScreen(modifier: Modifier = Modifier) {

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                Title = {
                    Text(text = "Movies")
                },
                modifier = TODO(),
                backgroundColor = TODO(),
                contentColor = TODO(),
                elevation = TODO(),
                contentPadding = TODO(),
                content = TODO()
            )
        }
    ) {  }
}