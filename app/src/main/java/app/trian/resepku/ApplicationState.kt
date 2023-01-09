/*
 * Copyright trian.app
 * Author Trian Damai-triandamai@gmail.com
 * Created at 07/01/23 22.45
*/
package app.trian.resepku

import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class ApplicationState internal constructor(
    val router: NavHostController
){
    var topAppBarType by mutableStateOf("")
    var bottomAppBarType by mutableStateOf("")
    var snackBarType by mutableStateOf("")

    var currentRoute by mutableStateOf("")

    var snackbarHostState by mutableStateOf(SnackbarHostState())

    fun changeBottomBar(type:String){
        if(bottomAppBarType != type){
            bottomAppBarType = type
        }
    }
    fun changeTopAppBar(type:String){
        if(topAppBarType != type){
            topAppBarType = type
        }
    }
    fun changeSnackbar(type:String){
        if(snackBarType != type){
            snackBarType = type
        }
    }
}

@Composable
fun rememberApplicationState(
    router:NavHostController = rememberNavController()
):ApplicationState {
    return remember{
        ApplicationState(
            router
        )
    }
}