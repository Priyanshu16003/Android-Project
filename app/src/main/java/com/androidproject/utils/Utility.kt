package com.androidproject.utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

class Utility {

    companion object {
        fun hideKeyboard(activity: Activity) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            val view = activity.currentFocus
            if (view != null) {
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }

    }
}