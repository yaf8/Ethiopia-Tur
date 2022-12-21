package com.example.ethiopiaactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.Gson;

import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Objects;

public class TigrayActivity extends AppCompatActivity {

    private ExtendedFloatingActionButton btnPicture;
    private Button btnComments, btnClear, btnPost;
    private ScrollView scrollPicture, scrollComments;
    private EditText edtEmail, edtComment;
    private ImageButton imgbtnBack;
    private RecyclerView commentsRV;

    @SuppressLint("StaticFieldLeak")
    private StudentAdapter adapter;
    private Gson gson;
    private ArrayList<StudentModal> StudentModalArrayList;
    private String STUD_PREF_NAME = "TIGRAY";
    private String STUD_PREF_KEY = "tigray_key";

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
        commentsRV = findViewById(R.id.commentsRV);

        loadData();
        buildRecyclerView();



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

        btnClear.setOnClickListener(v -> {
            StudentModalArrayList.clear();

            SharedPreferences sharedPreferences = getSharedPreferences(STUD_PREF_NAME, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            gson = new Gson();
            String json = gson.toJson(StudentModalArrayList);
            editor.putString(STUD_PREF_KEY, json);
            editor.apply();
            buildRecyclerView();
        });

        btnPost.setOnClickListener(v -> {
            if (!(edtEmail.getText().toString().isEmpty()) && !(edtComment.getText().toString()).isEmpty()) {
                StudentModalArrayList.add(new StudentModal(edtEmail.getText().toString(), edtComment.getText().toString()));
                adapter.notifyItemInserted(StudentModalArrayList.size());
                saveData();
                buildRecyclerView();
            }
        });

    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(STUD_PREF_NAME, MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString(STUD_PREF_KEY, null);
        Type type = new TypeToken<ArrayList<StudentModal>>() {}.getType();
        StudentModalArrayList = gson.fromJson(json, type);

        if (StudentModalArrayList == null) {
            StudentModalArrayList = new ArrayList<>();
        }
    }

    @SuppressLint("SetTextI18n")
    private void saveData()
    {
        for (StudentModal str : StudentModalArrayList) {
            if (!(Objects.equals(str.getID(), (edtEmail.getText().toString())))) {
                SharedPreferences sharedPreferences = getSharedPreferences(STUD_PREF_NAME, MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                gson = new Gson();
                String json = gson.toJson(StudentModalArrayList);
                editor.putString(STUD_PREF_KEY, json);
                editor.apply();

                edtEmail.setText("");
                edtComment.setText("");
                break;
            }
        }
    }

    private void buildRecyclerView() {
        adapter = new StudentAdapter(StudentModalArrayList, this);

        LinearLayoutManager manager = new LinearLayoutManager(this);

        commentsRV.setHasFixedSize(true);
        commentsRV.setLayoutManager(manager);
        commentsRV.setAdapter(adapter);
    }
}