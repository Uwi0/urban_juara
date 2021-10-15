package com.kakapo.kotlin.urbanjuara.di

import android.app.Activity
import com.kakapo.kotlin.urbanjuara.ui.splash.SplashPresenter
import com.kakapo.kotlin.urbanjuara.ui.splash.SplashPresenterImpl
import com.kakapo.kotlin.urbanjuara.ui.splash.SplashViewBinder
import com.kakapo.kotlin.urbanjuara.ui.splash.SplashViewBinderImpl
import com.kakapo.kotlin.urbanjuara.utils.navigation.Navigator
import com.kakapo.kotlin.urbanjuara.utils.navigation.NavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val activity: Activity) {

    @Module
    interface Bindings{

        @Binds
        fun bindSplashPresenter(impl: SplashPresenterImpl): SplashPresenter

        @Binds
        fun bindSplashViewBinder(impl: SplashViewBinderImpl): SplashViewBinder
    }

    @Provides
    fun provideNavigation(): Navigator = NavigatorImpl(activity)
}