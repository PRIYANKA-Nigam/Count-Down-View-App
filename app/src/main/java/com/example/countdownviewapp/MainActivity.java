package com.example.countdownviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cn.iwgang.countdownview.CountdownView;

public class MainActivity extends AppCompatActivity {
CountdownView co1,co2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        co1=findViewById(R.id.c1);
        co2=findViewById(R.id.c2);
        final int t1=20000,t2=90061000;
        co1.start(t1);
        co1.setOnCountdownEndListener(new CountdownView.OnCountdownEndListener() {
            @Override
            public void onEnd(CountdownView cv) {
                Toast.makeText(getApplicationContext(),"Timer first end",Toast.LENGTH_SHORT).show();
                co2.start(t2);
            }
        });
    }
}