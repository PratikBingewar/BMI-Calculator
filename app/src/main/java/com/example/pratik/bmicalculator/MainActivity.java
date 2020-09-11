package com.example.pratik.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    public static final String Number = "com.example.pratik.bmicalculator.Number";
    private Button button;
    private EditText height;
    private EditText weight;
    Double BMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    private void openActivity2() {

        if(calculateBMI()) {
            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra(Number,BMI);
            startActivity(intent);
        }
    }

    public boolean calculateBMI(){
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);

        Double height1 = Double.parseDouble(height.getText().toString());
        Double weight1 = Double.parseDouble(weight.getText().toString());

        if(height1 <= 0 || weight1 <= 0){
            Toast toast = Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT);
            toast.show();
            return  false;
        }
        BMI =  weight1/(height1*height1)*10000;
        BMI = (int)Math.round(BMI * 100)/(double)100;
        return  true;
    }
}