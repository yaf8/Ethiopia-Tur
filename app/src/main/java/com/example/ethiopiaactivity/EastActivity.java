package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class EastActivity extends AppCompatActivity {

    private ExtendedFloatingActionButton btnHarari, btnSomali;
    TextView textDiscrption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east);


        btnHarari = findViewById(R.id.btnHarari);
        btnSomali = findViewById(R.id.btnSomali);
        textDiscrption = findViewById(R.id.textDescription);

        RelativeLayout relativeLayoutDiscription = findViewById(R.id.relativeLayoutDescription);
        relativeLayoutDiscription.setVisibility(View.INVISIBLE);

        btnHarari.setOnClickListener(v -> {
           relativeLayoutDiscription.setVisibility(View.VISIBLE);
           textDiscrption.setText("Harari: \n\n" +
                   "" +
                   "\n\n");
        });
        btnSomali.setOnClickListener(v -> {
            relativeLayoutDiscription.setVisibility(View.VISIBLE);
            textDiscrption.setText("Somali: \n\n" +
                    "" +
                    "\n\n");
        });


    }
}