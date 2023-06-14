package com.example.mylocationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IntroActivity extends AppCompatActivity {

    ImageButton startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        startBtn = (ImageButton) findViewById(R.id.getStartbtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), HomeAcitvity.class);
                startActivity(i);
            }
        });
    }
}