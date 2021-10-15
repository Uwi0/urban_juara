package com.kakapo.kotlin.urbanjuara.utils.mvp

import com.kakapo.kotlin.urbanjuara.utils.mvp.impl.ViewBinder

interface Presenter<V, VB : ViewBinder<V>> {

    fun bind(viewBinder: VB)

    fun unbind()
}