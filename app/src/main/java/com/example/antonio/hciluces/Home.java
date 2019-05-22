package com.example.antonio.hciluces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button ledsButton = findViewById(R.id.ir);
        ledsButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, MainActivity.class));

            }
        });

        Button leds2Button = findViewById(R.id.ir2);
        leds2Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, MainActivity2.class));

            }
        });
    }
}
