package com.example.prototypetess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GevoelActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gevoel);

        btn = findViewById(R.id.buttonBegin);

        playAudio();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GevoelActivity.this, keuzeBehandelingActivity.class));
            }
        });
    }

    private void playAudio(){

        MediaPlayer stem = MediaPlayer.create(GevoelActivity.this, R.raw.gevoeljames);
        stem.start();
    }
}