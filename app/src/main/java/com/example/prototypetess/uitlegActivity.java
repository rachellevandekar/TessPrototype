package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.media.MediaPlayer.OnCompletionListener;

import java.util.Timer;
import java.util.TimerTask;

public class uitlegActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uitleg);




        videoView = findViewById(R.id.video);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pacetess));
       // playAudio();
        videoView.start();


        int timeout = 240000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent (uitlegActivity.this, vragenActivity.class);
                startActivity(intent);
            }
        }, timeout);





    }
}
