package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class SplashScreen_OpeningPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_opening_page);

        Intent iSplash = new Intent(SplashScreen_OpeningPage.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iSplash);
                finish();
            }
        }, 3000);

//        TextView breatheinout = findViewById(R.id.breatheinout);
//        breatheinout.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
    }
}