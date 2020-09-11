package com.example.pratik.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView bmi;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        Double BMI = intent.getDoubleExtra(MainActivity.Number,0);
        text = findViewById(R.id.textView2);
        bmi = findViewById(R.id.bmi);
        text.setText("Your BMI is");
        bmi.setText(BMI.toString());

    }
}
