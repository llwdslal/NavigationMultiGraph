package com.rock.ui_home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.rock.lib_base.navigation.navigateEx

@Composable
fun Home(navController: NavController,loginRoute:String){
    Column {
        Text("Home")
        Button(onClick = {
            navController.navigateEx("123")
        }) {
            Text("toLogin")
        }
    }
}
