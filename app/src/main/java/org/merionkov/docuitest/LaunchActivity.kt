package org.merionkov.docuitest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

private const val CONTENT_TYPE = "*/*"

class LaunchActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(Button(this)) {
            setText(R.string.btnLaunchText)
            setOnClickListener { launchDocUi() }
            setCentralizedContentView(this)
        }
    }

    private fun launchDocUi() {
        startActivity(createDocUiIntent())
    }

    private fun createDocUiIntent(): Intent {
        return Intent(Intent.ACTION_GET_CONTENT).apply {
            type = CONTENT_TYPE
            addCategory(Intent.CATEGORY_OPENABLE)
        }
    }
}
