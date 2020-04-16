package com.playworld.assignment.ui.login


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.playworld.assignment.R
import com.playworld.assignment.apppreferences.PlayWorldPreferences
import com.playworld.assignment.ui.dashboard.DashboardActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    var prefs: PlayWorldPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_login
        )

        prefs = PlayWorldPreferences(this)
        setClickListner()

        gotoNext()

    }

    private fun setClickListner() {

        btn_continue.setOnClickListener {
            prefs!!.isLogged = true
            gotoNext()
        }
    }


    private fun gotoNext() {
        if (prefs!!.isLogged) {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }
    }


}