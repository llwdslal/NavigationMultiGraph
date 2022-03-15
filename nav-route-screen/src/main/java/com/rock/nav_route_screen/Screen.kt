package com.rock.nav_route_screen

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.composable

open class Screen(private val _route:String){

    open val rootRoute:String? = null
    open val arguments:List<NamedNavArgument> = emptyList()
    open val deepLinks:List<NavDeepLink> = emptyList()

    val route:String
        get() = if (rootRoute == null) _route else "${rootRoute}/${_route}"

}

fun NavGraphBuilder.composableScreen(screen: Screen, content: @Composable (NavBackStackEntry) -> Unit){
     composable(route = screen.route,
         arguments = screen.arguments,
         deepLinks = screen.deepLinks,
         content = content)
}




