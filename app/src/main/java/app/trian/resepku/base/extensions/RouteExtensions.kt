package app.trian.resepku.base.extensions

import app.trian.resepku.ApplicationState

fun ApplicationState.listenRouteChanges(){
    with(this) {
        router.addOnDestinationChangedListener { _, destinatin, _ ->
            currentRoute = destinatin.route.orEmpty()
        }
    }
}