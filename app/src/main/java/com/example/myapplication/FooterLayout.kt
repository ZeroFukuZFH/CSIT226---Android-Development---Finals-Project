package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout

class FooterLayout : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_footer)

        val linearLayoutDashboardActivity = findViewById<LinearLayout>(R.id.linearLayoutDashBoardActivity)
        val linearLayoutCafesActivity = findViewById<LinearLayout>(R.id.linearLayoutCafesActivity)
        val linearLayoutSocialActivity = findViewById<LinearLayout>(R.id.linearLayoutSocialActivity)
        val linearLayoutProfileActivity = findViewById<LinearLayout>(R.id.linearLayoutProfileActivity)

        linearLayoutDashboardActivity.setOnClickListener {
            val dashboardActivity = Intent(this,DashboardActivity::class.java)
            startActivity(dashboardActivity)
            Log.e("HOME_BUTTON","Home Button has been Pressed")
        }

        linearLayoutCafesActivity.setOnClickListener {
            val dashboardActivity = Intent(this,DashboardActivity::class.java)
            startActivity(dashboardActivity)
            Log.e("CAFES_BUTTON","Cafes Button has been Pressed")
        }

        linearLayoutSocialActivity.setOnClickListener {
            val dashboardActivity = Intent(this,DashboardActivity::class.java)
            startActivity(dashboardActivity)
            Log.e("SOCIAL_BUTTON","Social Button has been Pressed")
        }

        linearLayoutProfileActivity.setOnClickListener {
            val dashboardActivity = Intent(this,DashboardActivity::class.java)
            startActivity(dashboardActivity)
            Log.e("PROFILE_BUTTON","Profile Button has been Pressed")
        }
    }
}