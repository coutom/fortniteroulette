package com.example.fortniteroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FirstRoll extends AppCompatActivity {

    ImageButton roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_roll);

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
