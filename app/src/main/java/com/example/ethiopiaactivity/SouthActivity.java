package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class SouthActivity extends AppCompatActivity {
    private ExtendedFloatingActionButton btnOromia, btnSNNPR, btnSidama;
    TextView textDiscrption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);

        RelativeLayout relativeLayoutDiscription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDiscription.setVisibility(View.INVISIBLE);

        btnOromia = findViewById(R.id.btnOromia);
        btnSNNPR = findViewById(R.id.btnSNNPR);
        btnSidama = findViewById(R.id.btnSidama);

        btnOromia.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);

        });
        btnSNNPR.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
        });
        btnSidama.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
        });

    }
}