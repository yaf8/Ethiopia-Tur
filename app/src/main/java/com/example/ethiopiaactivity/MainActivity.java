package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnEast, btnSouth, btnNorth, btnWest, btnMiddle, btnSong;
    ExtendedFloatingActionButton btnEthiopia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEthiopia = findViewById(R.id.btnEthiopia);
        btnSong = findViewById(R.id.btnSong);
        btnNorth = findViewById(R.id.btnNorth);
        btnSouth = findViewById(R.id.btnSouth);
        btnEast = findViewById(R.id.btnEast);
        btnWest = findViewById(R.id.btnWest);
        btnMiddle = findViewById(R.id.btnMiddle);

        btnEast.setVisibility(View.INVISIBLE);
        btnSouth.setVisibility(View.INVISIBLE);
        btnNorth.setVisibility(View.INVISIBLE);
        btnWest.setVisibility(View.INVISIBLE);
        btnMiddle.setVisibility(View.INVISIBLE);


        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.ethiopian_national_antem);

        btnSouth.setOnClickListener(v -> {
            Intent intent = new Intent(this, SouthActivity.class);
            startActivity(intent);
        });
        btnWest.setOnClickListener(v -> {
            Intent intent = new Intent(this, WestActivity.class);
            startActivity(intent);
        });
        btnNorth.setOnClickListener(v -> {
            Intent intent = new Intent(this, NorthActivity.class);
            startActivity(intent);
        });
        btnMiddle.setOnClickListener(v -> {
            Intent intent = new Intent(this, MiddleActivity.class);
            startActivity(intent);
        });
        btnEast.setOnClickListener(v -> {
            Intent intent = new Intent(this, EastActivity.class);
            startActivity(intent);
        });
        btnSong.setOnClickListener(v -> {
            if(mPlayer.isPlaying())
            {
                mPlayer.pause();
                btnSong.setImageResource(R.drawable.ic_play_30);
            }
            else
            {
                mPlayer.start();
                btnSong.setImageResource(R.drawable.ic_pause_30);
            }
        });
        btnEthiopia.setOnClickListener(v -> {
            if (btnNorth.getVisibility() == View.VISIBLE)
            {
                btnEast.setVisibility(View.INVISIBLE);
                btnSouth.setVisibility(View.INVISIBLE);
                btnNorth.setVisibility(View.INVISIBLE);
                btnWest.setVisibility(View.INVISIBLE);
                btnMiddle.setVisibility(View.INVISIBLE);
            }
            else
            {
                btnEast.setVisibility(View.VISIBLE);
                btnSouth.setVisibility(View.VISIBLE);
                btnNorth.setVisibility(View.VISIBLE);
                btnWest.setVisibility(View.VISIBLE);
                btnMiddle.setVisibility(View.VISIBLE);
            }
        });
    }
}