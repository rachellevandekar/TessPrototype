package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class eindActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eind);

        playAudio();


        int timeout = 4000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

            QuitApp();
            }
        }, timeout);



    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(eindActivity.this, R.raw.bedanktjames);
        stem.start();
    }

    public void QuitApp() {
        eindActivity.this.finishAffinity();
        System.exit(0);
    }



}