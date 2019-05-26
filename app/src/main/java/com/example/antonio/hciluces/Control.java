package com.example.antonio.hciluces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        CardView entradaButton = findViewById(R.id.entrada);
        entradaButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity.class));

            }
        });

        CardView garageButton = findViewById(R.id.garage);
        garageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity2.class));

            }
        });

        CardView salaButton = findViewById(R.id.sala);
        salaButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity3.class));

            }
        });

        CardView cocinaButton = findViewById(R.id.cocina);
        cocinaButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Control.this, MainActivity4.class));

            }
        });



    }
}
