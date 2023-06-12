package app.trian.core.ui.viewModel;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\'\u0018\u0000 K*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001KB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nJ\u000e\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000eJ1\u0010(\u001a\u00020)2\u001e\b\u0004\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0,\u0012\u0006\u0012\u0004\u0018\u00010-0+H\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J1\u0010/\u001a\u00020)2\u001e\b\u0004\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0,\u0012\u0006\u0012\u0004\u0018\u00010-0+H\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J<\u00100\u001a\u00020)2)\b\u0004\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0,\u0012\u0006\u0012\u0004\u0018\u00010-01\u00a2\u0006\u0002\b2H\u0084\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J7\u00104\u001a\u0002H5\"\u0004\b\u0002\u001052\u001e\b\u0004\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50,\u0012\u0006\u0012\u0004\u0018\u00010-0+H\u0084H\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020$2\u0006\u00108\u001a\u00028\u0000\u00a2\u0006\u0002\u00109J\u001f\u00107\u001a\u00020$2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000+\u00a2\u0006\u0002\b2J\u0013\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00028\u0001\u00a2\u0006\u0002\u0010<J\b\u0010=\u001a\u00020$H$J\b\u0010>\u001a\u00020$H\u0014J4\u0010?\u001a\u00020$2\"\u0010*\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0,\u0012\u0006\u0012\u0004\u0018\u00010-01H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J\u0006\u0010A\u001a\u00020$J2\u00107\u001a\u00020$*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0017\u0010B\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000+\u00a2\u0006\u0002\b2H\u0084\u0004JX\u0010C\u001a\u00020)\"\u0004\b\u0002\u00105*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H50E0D2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020$0+2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020$0H2\u0014\b\u0002\u0010I\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020$0+R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\n8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006L"}, d2 = {"Lapp/trian/core/ui/viewModel/BaseViewModel;", "State", "Landroid/os/Parcelable;", "Action", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "initialState", "(Landroid/content/Context;Landroid/os/Parcelable;)V", "_bottomSheetListener", "Lapp/trian/core/ui/listener/BottomSheetListener;", "_navigationListener", "Lapp/trian/core/ui/listener/NavigationListener;", "_toastListener", "Lapp/trian/core/ui/listener/ToastListener;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "action", "Lkotlinx/coroutines/channels/Channel;", "bottomSheet", "getBottomSheet", "()Lapp/trian/core/ui/listener/BottomSheetListener;", "getContext", "()Landroid/content/Context;", "Landroid/os/Parcelable;", "navigation", "getNavigation", "()Lapp/trian/core/ui/listener/NavigationListener;", "toast", "getToast", "()Lapp/trian/core/ui/listener/ToastListener;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addBottomSheetListener", "", "listener", "addNavigationListener", "addToastListener", "async", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "asyncFlow", "asyncWithState", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "await", "T", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commit", "state", "(Landroid/os/Parcelable;)V", "dispatch", "e", "(Ljava/lang/Object;)Lkotlinx/coroutines/Job;", "handleActions", "onCleared", "onEvent", "(Lkotlin/jvm/functions/Function2;)V", "resetState", "s", "onEach", "Lkotlinx/coroutines/flow/Flow;", "Lapp/trian/core/ui/Response;", "success", "loading", "Lkotlin/Function0;", "error", "", "Companion", "core-ui_debug"})
public abstract class BaseViewModel<State extends android.os.Parcelable, Action extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final State initialState = null;
    @org.jetbrains.annotations.NotNull
    public static final app.trian.core.ui.viewModel.BaseViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<State> _uiState = null;
    private final kotlinx.coroutines.channels.Channel<Action> action = null;
    private app.trian.core.ui.listener.ToastListener _toastListener;
    private app.trian.core.ui.listener.NavigationListener _navigationListener;
    private app.trian.core.ui.listener.BottomSheetListener _bottomSheetListener;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    State initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<State> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final app.trian.core.ui.listener.ToastListener getToast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final app.trian.core.ui.listener.NavigationListener getNavigation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final app.trian.core.ui.listener.BottomSheetListener getBottomSheet() {
        return null;
    }
    
    public final void addToastListener(@org.jetbrains.annotations.NotNull
    app.trian.core.ui.listener.ToastListener listener) {
    }
    
    public final void addNavigationListener(@org.jetbrains.annotations.NotNull
    app.trian.core.ui.listener.NavigationListener listener) {
    }
    
    public final void addBottomSheetListener(@org.jetbrains.annotations.NotNull
    app.trian.core.ui.listener.BottomSheetListener listener) {
    }
    
    protected final void onEvent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super Action, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job async(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job asyncWithState(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super State, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <T extends java.lang.Object>java.lang.Object await(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.Job asyncFlow(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    protected abstract void handleActions();
    
    public final void commit(@org.jetbrains.annotations.NotNull
    State state) {
    }
    
    public final void commit(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super State, ? extends State> state) {
    }
    
    protected final void commit(@org.jetbrains.annotations.NotNull
    app.trian.core.ui.viewModel.BaseViewModel<State, Action> $this$commit, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super State, ? extends State> s) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>kotlinx.coroutines.Job onEach(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends app.trian.core.ui.Response<? extends T>> $this$onEach, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> success, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> loading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> error) {
        return null;
    }
    
    public final void resetState() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job dispatch(Action e) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lapp/trian/core/ui/viewModel/BaseViewModel$Companion;", "", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "core-ui_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
            return null;
        }
    }
}