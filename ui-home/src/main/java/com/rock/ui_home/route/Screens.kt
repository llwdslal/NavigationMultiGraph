package com.rock.ui_home.route

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.rock.lib_base.navigation.Screen
import com.rock.lib_base.navigation.composableScreen
import com.rock.ui_home.Home

sealed class HomeScreen(route:String): Screen(route){
    companion object {
        const val root = "home"
    }
    override val rootRoute: String
        get() = root

    object Home:HomeScreen("home")

}

data class OuterRouteInHome(
    val loginRoute:String
)

fun NavGraphBuilder.createHomeGraph(controller: NavController,outerRouteInHome: OuterRouteInHome){
    navigation(startDestination = HomeScreen.Home.route,route = HomeScreen.root){
        composableScreen(HomeScreen.Home){
            Home(controller,outerRouteInHome.loginRoute)
        }
    }
}