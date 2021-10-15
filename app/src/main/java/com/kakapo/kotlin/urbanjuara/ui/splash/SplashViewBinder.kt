package com.kakapo.kotlin.urbanjuara.ui.splash

import com.kakapo.kotlin.urbanjuara.utils.mvp.impl.ViewBinder

interface SplashViewBinder: ViewBinder<SplashActivity> {

    fun gotoMain()

    fun handleError(error: Throwable)
}