package com.junrdev.passify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private final long SPLASH_DURATION = 3000;

    private SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        new Handler().postDelayed(()->{

            sharedPreferences = getSharedPreferences("SharedPreferences", MODE_PRIVATE);
            boolean isFirstTime = sharedPreferences.getBoolean("FirstTime", true);

            if (isFirstTime){

            }else {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, SPLASH_DURATION);
    }
}