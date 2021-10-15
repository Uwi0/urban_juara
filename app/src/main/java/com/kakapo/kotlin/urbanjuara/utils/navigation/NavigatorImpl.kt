package com.kakapo.kotlin.urbanjuara.utils.navigation

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ActivityNavigator

class NavigatorImpl(private val activity: Activity) : Navigator {
    override fun navigateTo(destination: Destination, params: Bundle?) {
        when(destination){
            is ActivityIntentDestination -> {
                activity.startActivity(destination.intent)
            }
            is FragmentDestination<*> -> {
                val builder = (activity as AppCompatActivity).supportFragmentManager
                    .beginTransaction()
                    .replace(destination.anchorId, destination.fragment)
                destination.withBackStack?.run {
                    builder.addToBackStack(this)
                }
                builder.commit()
            }
            is FragmentFactoryDestination<*> -> {
                val builder = (activity as AppCompatActivity).supportFragmentManager
                    .beginTransaction()
                    .replace(destination.anchorId, destination.fragmentFactory(destination.bundle))
                destination.withBackStack?.run {
                    builder.addToBackStack(this)
                }
                builder.commit()
            }
            ActivityBackDestination -> activity.finish()
            FragmentBackDestination -> (activity as AppCompatActivity)
                .supportFragmentManager
                .popBackStack()
        }
    }
}