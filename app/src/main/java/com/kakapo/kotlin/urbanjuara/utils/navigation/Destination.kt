package com.kakapo.kotlin.urbanjuara.utils.navigation

import android.content.Intent
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

sealed class Destination

data class ActivityIntentDestination(val intent: Intent) : Destination()

data class FragmentDestination<out T : Fragment>(
    val fragment: T,
    @IdRes val anchorId: Int,
    val withBackStack: String? = null,
) : Destination()

data class FragmentFactoryDestination<out T : Fragment>(
    val fragmentFactory: (Bundle?) -> T,
    @IdRes val anchorId: Int,
    val withBackStack: String? = null,
    val bundle: Bundle? = null
) : Destination()

object ActivityBackDestination : Destination()

object FragmentBackDestination : Destination()