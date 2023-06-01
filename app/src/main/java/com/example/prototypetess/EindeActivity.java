package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class EindeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_einde);

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

        MediaPlayer stem = MediaPlayer.create(EindeActivity.this, R.raw.verpleegkundigejames);
        stem.start();
    }

    public void QuitApp() {
        EindeActivity.this.finishAffinity();

        System.exit(0);
    }
}