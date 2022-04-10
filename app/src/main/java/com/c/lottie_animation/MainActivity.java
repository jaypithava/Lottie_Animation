
package com.c.lottie_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView android_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android_Logo=findViewById(R.id.android_Logo);

        Handler handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                android_Logo.setVisibility(View.VISIBLE);
                android_Logo.playAnimation();

            }
        }, 3000);

        android_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android_Logo.playAnimation();
            }
        });
    }

}