package com.example.ethiopiaactivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class NorthActivity extends AppCompatActivity {

    private ExtendedFloatingActionButton btnTigray, btnAfar, btnAmhara;
    TextView textDiscrption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        RelativeLayout relativeLayoutDiscription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDiscription.setVisibility(View.INVISIBLE);


        btnTigray = findViewById(R.id.btnTigray);
        btnAfar = findViewById(R.id.btnAfar);
        btnAmhara = findViewById(R.id.btnAmhara);
        textDiscrption = findViewById(R.id.textDiscription);

        btnTigray.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
            textDiscrption.setText(" Tigray : \n\n The Tigray Region, officially the Tigray National Regional State, is the northernmost " +
                    "regional state in Ethiopia. The Tigray Region is the homeland of the Tigrayan people. Formerly known as " +
                    "Region 1, its capital and largest city is Mekelle.");
        });
        btnAfar.setOnClickListener(v -> {

        });
        btnAmhara.setOnClickListener(v -> {

        });

    }
}