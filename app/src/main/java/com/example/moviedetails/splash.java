package com.example.moviedetails;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        LottieAnimationView animationView = findViewById(R.id.splash_animation);
        animationView.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                // Animation has ended, do any necessary setup or navigate to the next activity
                // For example, you can use an Intent to start another activity
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);

                // Finish the current activity to prevent going back to the splash screen
                finish();
            }
        });
    }
}

