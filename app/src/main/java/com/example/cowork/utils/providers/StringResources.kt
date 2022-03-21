package com.example.cowork.utils.providers

import android.content.Context
import androidx.annotation.StringRes
import com.example.cowork.R

class StringResources(
    private val context: Context
) : IStringResources {
    override val welcomeToCoworkTitle: String by lazyString(R.string.welcome_to_cowork_title)
    override val findWorkingSpaceTitle: String by lazyString(R.string.find_a_working_space)
    override val createAnEvent: String by lazyString(R.string.create_an_event)


    private fun lazyString(@StringRes string: Int) = lazy(LazyThreadSafetyMode.NONE) {
        context.getString(string)
    }
}