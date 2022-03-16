package com.rock.ui_login.screens

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.rock.lib_base.navigation.Screen
import com.rock.lib_base.navigation.composableScreen

import com.rock.ui_login.Login
import com.rock.ui_login.ResetPwd

sealed class LoginScreen(route:String): Screen(route){
    companion object {
        const val root = "login"
    }
    override val rootRoute: String
        get() = root

    object Login:LoginScreen("login")

    object ResetPwd:LoginScreen("reset_pwd")
}

fun NavGraphBuilder.createLoginGraph(controller: NavController){
    navigation(startDestination = LoginScreen.Login.route,route = LoginScreen.root){
        composableScreen(LoginScreen.Login){
            Login(controller)
        }

        composableScreen(LoginScreen.ResetPwd){
            ResetPwd(controller)
        }
    }
}

