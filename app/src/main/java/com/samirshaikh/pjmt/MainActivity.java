package com.samirshaikh.pjmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btn;
        btn = findViewById(R.id.add_note_button);

        btn.setOnClickListener((v -> startActivity(new Intent(MainActivity.this,AddNoteDetails.class))));


    }



}