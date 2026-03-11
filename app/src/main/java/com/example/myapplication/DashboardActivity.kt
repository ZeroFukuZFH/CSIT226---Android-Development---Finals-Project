package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout

class DashboardActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val linearLayoutDashboardActivity = findViewById<LinearLayout>(R.id.linearLayoutDashBoardActivity)
        val linearLayoutCafesActivity = findViewById<LinearLayout>(R.id.linearLayoutCafesActivity)
        val linearLayoutSocialActivity = findViewById<LinearLayout>(R.id.linearLayoutSocialActivity)
        val linearLayoutProfileActivity = findViewById<LinearLayout>(R.id.linearLayoutProfileActivity)

        linearLayoutDashboardActivity.setOnClickListener {

        }

        linearLayoutCafesActivity.setOnClickListener {

        }

        linearLayoutSocialActivity.setOnClickListener {

        }

        linearLayoutProfileActivity.setOnClickListener {

        }


    }
}