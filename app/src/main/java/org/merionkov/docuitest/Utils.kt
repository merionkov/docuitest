package org.merionkov.docuitest

import android.app.Activity
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

fun Activity.setCentralizedContentView(contentView: View) {
    setContentView(contentView)
    contentView.setupLayoutParams<FrameLayout.LayoutParams> {
        width = ViewGroup.LayoutParams.WRAP_CONTENT
        height = ViewGroup.LayoutParams.WRAP_CONTENT
        gravity = Gravity.CENTER
    }
}

@Suppress("UNCHECKED_CAST")
fun <T : ViewGroup.LayoutParams> View.setupLayoutParams(setup: T.() -> Unit) {
    post { layoutParams = (layoutParams as T).apply(setup) }
}
