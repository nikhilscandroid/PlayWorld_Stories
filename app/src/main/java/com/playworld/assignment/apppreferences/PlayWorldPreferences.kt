package com.playworld.assignment.apppreferences

import android.content.Context
import android.content.SharedPreferences


class PlayWorldPreferences(context: Context) {
    val PREFS_FILENAME = "com.playworld.assignment.prefs"
    val IS_USER_LOGGED_IN = "is_user_logged_in"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    var isLogged: Boolean
        get() = prefs.getBoolean(IS_USER_LOGGED_IN, false)
        set(value) = prefs.edit().putBoolean(IS_USER_LOGGED_IN, value).apply()
}