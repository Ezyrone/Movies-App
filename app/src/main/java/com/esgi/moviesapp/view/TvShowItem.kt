package com.esgi.moviesapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.esgi.moviesapp.data.model.TvShow

@Composable
fun TvShowItem(
    tvShow: TvShow,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .height(200.dp)
    ){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            AsyncImage(
                model = tvShow.image,
                contentDescription = tvShow.name,
                modifier = Modifier.fillMaxSize()
            )

            Text(
                text = tvShow.name,
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxSize()
                    .height(150.dp)
            )

        }
    }
}
