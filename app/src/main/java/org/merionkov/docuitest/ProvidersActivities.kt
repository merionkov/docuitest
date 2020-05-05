package org.merionkov.docuitest

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.StringRes

class FirstProviderActivity : BaseProviderActivity(R.string.firstProviderName)

class SecondProviderActivity : BaseProviderActivity(R.string.secondProviderName)

abstract class BaseProviderActivity(@StringRes private val label: Int) : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        with(TextView(this)) {
            setText(label)
            setCentralizedContentView(this)
        }
    }
}
