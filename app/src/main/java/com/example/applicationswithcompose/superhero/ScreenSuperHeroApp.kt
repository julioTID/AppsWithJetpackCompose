package com.example.applicationswithcompose.superhero

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.example.applicationswithcompose.R

@Preview
@Composable
fun ScreenSuperHeroApp () {

    var searchText by remember{
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(
        ) {
            TextField(
                value = searchText,
                onValueChange = {
                    searchText = it
                },
                placeholder = {
                    Text(text = "Busque un super héroe")
                },
                trailingIcon = {
                    Icon(painter = painterResource(id = R.drawable.ic_search), contentDescription = null )
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions() ,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }
}