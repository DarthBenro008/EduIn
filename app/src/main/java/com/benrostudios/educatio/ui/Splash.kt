package com.benrostudios.educatio.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.benrostudios.educatio.R
import com.benrostudios.educatio.ui.auth.Auth
import com.benrostudios.educatio.ui.home.Home
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class Splash : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
            {
                if (FirebaseAuth.getInstance().currentUser != null) {
                    startActivity(Intent(this, Home::class.java))
                    this.finish()
                } else {
                    startActivity(Intent(this, Auth::class.java))
                    this.finish()
                }

            }, SPLASH_TIME_OUT
        )
    }
}
