package com.kakapo.kotlin.urbanjuara.ui.splash

import android.content.Intent
import android.os.Handler
import com.kakapo.kotlin.urbanjuara.ui.main.MainActivity
import com.kakapo.kotlin.urbanjuara.utils.navigation.ActivityIntentDestination
import com.kakapo.kotlin.urbanjuara.utils.navigation.Navigator
import javax.inject.Inject

class SplashViewBinderImpl @Inject constructor(
    private val navigator: Navigator
) : SplashViewBinder {


    private val handler = Handler()
    private lateinit var splashActivity: SplashActivity

    override fun init(rootView: SplashActivity) {
        splashActivity = rootView
    }

    override fun gotoMain() {
        handler.post{
            navigator.navigateTo(
                ActivityIntentDestination(
                    Intent(splashActivity, MainActivity::class.java)
                )
            )
        }
    }

    override fun handleError(error: Throwable) {
        TODO("Not yet implemented")
    }
}