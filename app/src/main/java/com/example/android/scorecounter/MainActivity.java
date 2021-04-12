package com.example.android.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number1=0;
    int number2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inca1(View view){
        display1(++number1);
    }
    public void inca2(View view){
        number1=number1 +2;
        display1(number1);
    }
    public void inca3(View view){
        number1=number1 +3;
        display1(number1);
    }
    public void incb1(View view){
        display2(++number2);
    }
    public void incb2(View view){
        number2=number2 +2;
        display2(number2);
    }
    public void incb3(View view){
        number2=number2 +3;
        display2(number2);
    }
    public void reset(View view){
        number1=0;
        number2=0;
        display1(number1);
        display2(number2);
    }
    private void display1(int number1) {
        TextView quantityTextView = (TextView) findViewById(R.id.score1);
        quantityTextView.setText("" + number1);
    }
    private void display2(int number2) {
        TextView quantityTextView = (TextView) findViewById(R.id.score2);
        quantityTextView.setText("" + number2);
    }
}
