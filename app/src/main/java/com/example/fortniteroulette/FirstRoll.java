package com.example.fortniteroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstRoll extends AppCompatActivity {

    Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_roll);

        roll = (Button) findViewById(R.id.roll_btn);

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
