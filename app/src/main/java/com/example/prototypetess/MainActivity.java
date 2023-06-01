package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.media.AudioAttributes;
import android.net.Uri;
import java.io.IOException;
import java.util.Timer;

import java.io.File;
import java.util.TimerTask;
import android.app.ActivityManager;
import android.content.Context;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        playAudio();

        int timeout = 6000; // make the activity visible for 4 seconds

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, BehandelingActivity.class);
                startActivity(intent);
            }
        }, timeout);


    }






    private void playAudio(){
        MediaPlayer stem = MediaPlayer.create(MainActivity.this, R.raw.introjames);
        stem.start();


/*
        try{
        Uri myUri = Uri.fromFile(new File("/storage/emulated/0/zbos_media_library/intro.m4a")); // initialize Uri here
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(getApplicationContext(), myUri);
        mediaPlayer.prepare();
        mediaPlayer.start();}
        catch (Exception ex) {
            ex.printStackTrace();
        }
*/
    }
}