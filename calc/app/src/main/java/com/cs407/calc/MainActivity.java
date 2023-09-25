package com.cs407.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction1(View view){

        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);
        add(number1.getText().toString(), number2.getText().toString());

    }
    public void clickFunction2(View view){

        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);
        minus(number1.getText().toString(), number2.getText().toString());

    }
    public void clickFunction3(View view){

        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);
        multi(number1.getText().toString(), number2.getText().toString());

    }
    public void clickFunction4(View view){

        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);
        divi(number1.getText().toString(), number2.getText().toString());

    }

    public void add(String num1, String num2) {
        Intent intent = new Intent(this, add.class);
        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);
        startActivity(intent);
    }
    public void minus(String num1, String num2) {
        Intent intent = new Intent(this, minus.class);
        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);
        startActivity(intent);
    }
    public void multi(String num1, String num2) {
        Intent intent = new Intent(this, multi.class);
        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);
        startActivity(intent);
    }
    public void divi(String num1, String num2) {
        Intent intent = new Intent(this, divi.class);
        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);
        startActivity(intent);
    }
}