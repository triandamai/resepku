package app.trian.core.ui.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lapp/trian/core/ui/listener/ScreenToAppEvent;", "", "EXIT_APP", "Lapp/trian/core/ui/listener/ScreenToAppEvent$EXIT_APP;", "core-ui_debug"})
public abstract interface ScreenToAppEvent {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lapp/trian/core/ui/listener/ScreenToAppEvent$EXIT_APP;", "Lapp/trian/core/ui/listener/ScreenToAppEvent;", "()V", "core-ui_debug"})
    public static final class EXIT_APP implements app.trian.core.ui.listener.ScreenToAppEvent {
        @org.jetbrains.annotations.NotNull
        public static final app.trian.core.ui.listener.ScreenToAppEvent.EXIT_APP INSTANCE = null;
        
        private EXIT_APP() {
            super();
        }
    }
}