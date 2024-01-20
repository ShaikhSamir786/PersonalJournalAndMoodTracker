package com.samirshaikh.pjmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class loading extends AppCompatActivity {

    ProgressBar pg;
    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);


    prog();
    }


    public void  prog(){
        pg= (ProgressBar) findViewById(R.id.progress_circular);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter ++ ;
                pg.setProgress(counter);

                startActivity(new Intent(loading.this ,SignupActivity.class));
                finish();
            }
        };

    }

}