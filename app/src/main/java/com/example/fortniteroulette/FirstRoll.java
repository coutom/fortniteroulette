package com.example.fortniteroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FirstRoll extends AppCompatActivity {

    ImageButton roll;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_roll);

        MobileAds.initialize(this, "ca-app-pub-6663849184001520~6055836060");

        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        roll = (ImageButton) findViewById(R.id.roll_btn);
        roll.setBackgroundResource(0);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstRoll.this, Roll.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
