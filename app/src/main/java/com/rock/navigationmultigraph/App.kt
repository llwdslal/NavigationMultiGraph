package com.rock.navigationmultigraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rock.ui_login.screens.LoginScreen
import com.rock.ui_login.screens.createLoginGraph

@Composable
fun App(){
    val navController = rememberNavController();
    NavHost(navController = navController, startDestination = LoginScreen.root){
        createLoginGraph(controller = navController)
    }
}