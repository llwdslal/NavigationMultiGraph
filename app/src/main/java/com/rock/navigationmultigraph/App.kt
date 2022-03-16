package com.rock.navigationmultigraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rock.lib_base.navigation.PageNotFoundScreen
import com.rock.lib_base.navigation.composableScreen
import com.rock.ui_home.route.HomeScreen
import com.rock.ui_home.route.OuterRouteInHome
import com.rock.ui_home.route.createHomeGraph
import com.rock.ui_login.route.LoginScreen
import com.rock.ui_login.route.createLoginGraph

@Composable
fun App(){
    val navController = rememberNavController();
    NavHost(navController = navController, startDestination = HomeScreen.root){
        createHomeGraph(controller = navController, OuterRouteInHome(LoginScreen.Login.route))
        createLoginGraph(controller = navController)

        composableScreen(PageNotFoundScreen){
            PageNotFound()
        }
    }
}