package com.example.antonio.hciluces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.CardView;

public class Home extends AppCompatActivity {
    private android.support.v7.widget.CardView informacionCard, videoCard, lucesCard, ayudaCard, autoresCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CardView videoButton = findViewById(R.id.video);
        videoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, Video.class));

            }
        });

        CardView controlButton = findViewById(R.id.listaLuces);
        controlButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, Control.class));

            }
        });

        CardView infoButton = findViewById(R.id.info);
        infoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               startActivity(new Intent(Home.this, Info.class));

            }
        });

        CardView helpButton = findViewById(R.id.ayuda);
        helpButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, Help.class));

            }
        });

        CardView aboutButton = findViewById(R.id.nosotros);
        aboutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Home.this, About_Us.class));

            }
        });



    }

}
