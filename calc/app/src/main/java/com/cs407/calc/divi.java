package com.cs407.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class divi extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divi);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        int num1 = Integer.parseInt(intent.getStringExtra("num1"));
        int num2 = Integer.parseInt(intent.getStringExtra("num2"));
        if (num2-1 == -1) {
            textView.setText("the second number cannot be 0.");
        } else {
            int result = num1/num2;
            textView.setText("The result is "+result);
        }

    }
}