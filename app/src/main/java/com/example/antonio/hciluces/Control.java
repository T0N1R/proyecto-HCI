package com.example.antonio.hciluces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        CardView bButton1 = findViewById(R.id.op1);
        bButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity.class));

            }
        });

        CardView bButton2 = findViewById(R.id.op2);
        bButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity2.class));

            }
        });
    }
}
