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

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {
    Button btnStart;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnStart = findViewById(R.id.buttonStart);


        videoView = findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.startjames));
        // playAudio();
        videoView.start();

        int timeout = 50000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent (StartActivity.this, herhalingActivity.class);
                startActivity(intent);
            }
        }, timeout);



        //playAudio();


        Handler handler = new Handler();
        btnStart.setVisibility(View.GONE);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                btnStart.setVisibility(View.VISIBLE);
                btnStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(StartActivity.this, uitlegActivity.class));
                    }
                });
            }
        };
// run runnable after 5 seconds
        handler.postDelayed(runnable, 19000);
    }

    private void playAudio() {

        MediaPlayer stem = MediaPlayer.create(StartActivity.this, R.raw.introtess);
        stem.start();
    }
}