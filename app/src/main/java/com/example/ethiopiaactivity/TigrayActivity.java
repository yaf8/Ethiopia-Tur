package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class TigrayActivity extends AppCompatActivity {

    ExtendedFloatingActionButton btnPicture;
    Button btnComments, btnClear, btnPost;
    ScrollView scrollPicture, scrollComments;
    EditText edtEmail, edtComment;
    ImageButton imgbtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tigray);

        btnPicture = findViewById(R.id.btnPictures);
        btnComments = findViewById(R.id.btnComments);
        btnClear = findViewById(R.id.btnClear);
        btnPost = findViewById(R.id.btnPost);
        scrollPicture = findViewById(R.id.scrollPictures);
        scrollComments = findViewById(R.id.scrollComments);
        edtEmail = findViewById(R.id.edtEmail);
        edtComment = findViewById(R.id.edtComment);
        imgbtnBack = findViewById(R.id.imgbtnBack);

        btnPicture.setOnClickListener(v -> {
            scrollComments.setVisibility(View.INVISIBLE);
            if (scrollPicture.getVisibility() == View.INVISIBLE){
                scrollPicture.setVisibility(View.VISIBLE);
            }
        });

        btnComments.setOnClickListener(v -> {
            scrollPicture.setVisibility(View.INVISIBLE);
            if (scrollComments.getVisibility() == View.INVISIBLE){
                scrollComments.setVisibility(View.VISIBLE);
            }
        });

        imgbtnBack.setOnClickListener(v -> {
            Intent intent = new Intent(TigrayActivity.this, NorthActivity.class);
            startActivity(intent);
            finish();
        });
    }
}