package com.example.mylocationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class HomeAcitvity extends AppCompatActivity {

    TextView textDate;
    TextView textTime;
    TextView textRange;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textDate=(TextView) findViewById(R.id.textViewDate);
        textTime=(TextView) findViewById(R.id.textViewTime);
        textDate.setText(getCurrentTime());
        textTime.setText(getCurrentDate());

        //Seek Bar Code
        textRange = (TextView) findViewById(R.id.textViewRange);
        seekBar = (SeekBar) findViewById(R.id.seekBarId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textRange.setText("Note : Matching Range in Meters ("+String.valueOf(i)+")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    private String getCurrentDate() {
        return new SimpleDateFormat( "dd:MM:yyyy", Locale.getDefault()).format(new Date());
    }

    private String getCurrentTime() {
        return new SimpleDateFormat("hh:mm a",Locale.getDefault()).format(new Date());
    }
}