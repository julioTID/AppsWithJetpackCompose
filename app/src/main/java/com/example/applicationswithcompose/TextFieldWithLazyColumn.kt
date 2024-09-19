package com.example.applicationswithcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TextFieldWithLazyColumn(){

    var name by remember { mutableStateOf("") }

    var names by remember {
        mutableStateOf( listOf<String>())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            OutlinedTextField(
                value = name ,
                onValueChange = {
                        text -> name = text
                },
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Button(
                onClick = {
                    if(name.isNotBlank()){
                        names += name
                    }
                    name = ""
                }) {
                Text(text = "Add")
            }
        }

        LazyColumnWithList(list = names)



    }
}

@Composable
fun LazyColumnWithList(list: List<String>) {

    LazyColumn(
        modifier = Modifier.fillMaxHeight()
    ) {
        items(list){
                item -> Text(
            text = item,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth())

            Divider()
        }

    }
    
}