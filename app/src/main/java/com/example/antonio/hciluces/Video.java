package com.example.antonio.hciluces;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        final Boolean bool;
        final VideoView videoView= findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/"+ R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        android.support.v7.widget.CardView controlButton = findViewById(R.id.play);
        controlButton.setOnClickListener(new android.view.View.OnClickListener(){
            public void onClick(android.view.View v){
                videoView.start();

            }
        });

    }
}
