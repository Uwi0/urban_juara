package com.kakapo.kotlin.urbanjuara.ui.splash

import com.kakapo.kotlin.urbanjuara.utils.mvp.Presenter

interface SplashPresenter: Presenter<SplashActivity, SplashViewBinder> {

    fun start()

    fun stop()
}