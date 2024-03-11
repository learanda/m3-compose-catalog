package com.example.m3catalog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyButton() {
    Button(onClick = { }) {
        Text(text = "Botón")
    }
}

@Composable
fun MyButton2() {
    Button(
        onClick = { },
        enabled = false,
        colors = ButtonDefaults.buttonColors(
            disabledContainerColor = Color.Red,
            disabledContentColor = Color.Black
        )
    ) {
        Text(text = "Botón2")
    }
}

@Composable
fun MyFilledTonalButton() {
    FilledTonalButton(onClick = { /*TODO*/ }) {
        Text(text = "Filled Tonal Button")
    }
}

@Composable
fun MyElevatedButton() {
    ElevatedButton(onClick = { /*TODO*/ }) {
        Text(text = "Elevated Button")
    }
}

@Composable
fun MyFloatingActionButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Red,
        contentColor = Color.White
    ) {
        Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favourite")
    }
}

@Composable
fun MySmallFloatingActionButton() {
    SmallFloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Red,
        contentColor = Color.White
    ) {
        Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favourite")
    }
}

@Preview
@Composable
fun MyFloatingActionButtons() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = Color.Red,
            contentColor = Color.White,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favourite")
        }
        FloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = Color.Red,
            contentColor = Color.White,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favourite")
        }

        SmallFloatingActionButton(
            onClick = { /*TODO*/ },
            containerColor = Color.Red,
            contentColor = Color.White,
            modifier = Modifier.padding(8.dp)
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = "favourite")
        }

        ExtendedFloatingActionButton(onClick = { print("Hello") },
            text = { Text(text = "Extended FAB") },
            icon = { Icon(Icons.Filled.Favorite, "Floating action button.") })
    }
}