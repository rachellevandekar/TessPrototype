package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class startStentActivity extends AppCompatActivity {
    Button btnStart;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_stent);
        btnStart = findViewById(R.id.buttonStart);

        //playAudio();

        btnStart = findViewById(R.id.buttonStart);


        videoView = findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.startjames));
        // playAudio();
        videoView.start();


        Handler handler = new Handler();
        btnStart.setVisibility(View.GONE);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                btnStart.setVisibility(View.VISIBLE);
                btnStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(startStentActivity.this, stentActivity.class));
                    }
                });
            }
        };
// run runnable after 5 seconds
        handler.postDelayed(runnable, 19000);
    }

    private void playAudio() {

        MediaPlayer stem = MediaPlayer.create(startStentActivity.this, R.raw.infotess);
        stem.start();
    }
}