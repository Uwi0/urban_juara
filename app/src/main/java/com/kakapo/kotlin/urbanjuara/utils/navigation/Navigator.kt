package com.kakapo.kotlin.urbanjuara.utils.navigation

import android.os.Bundle

interface Navigator {

    fun navigateTo(destination: Destination, params: Bundle? = null)
}