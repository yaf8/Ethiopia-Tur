package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnEast, btnSouth, btnNorth, btnWest, btnMiddle, btnEthiopia, btnSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEthiopia = findViewById(R.id.btnEthiopia);
        btnEast = findViewById(R.id.btnEast);
        btnNorth = findViewById(R.id.btnNorth);
        btnSouth = findViewById(R.id.btnSouth);
        btnMiddle = findViewById(R.id.btnMiddle);
        btnWest = findViewById(R.id.btnWest);
        btnSong = findViewById(R.id.btnSong);

        btnEast.setVisibility(View.INVISIBLE);
        btnSouth.setVisibility(View.INVISIBLE);
        btnNorth.setVisibility(View.INVISIBLE);
        btnWest.setVisibility(View.INVISIBLE);
        btnMiddle.setVisibility(View.INVISIBLE);

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