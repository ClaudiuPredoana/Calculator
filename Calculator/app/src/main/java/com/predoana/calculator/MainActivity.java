package com.predoana.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextFirstValue = findViewById(R.id.et_firstNumber);
        final EditText editTextSecondValue = findViewById(R.id.et_secondNumber);
        Button button = findViewById(R.id.btn_add);
        Button button1 = findViewById(R.id.btn_sub);
        Button button2 = findViewById(R.id.btn_mul);
        Button button3 = findViewById(R.id.btn_div);
        final TextView textViewResult = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();

               int result = Integer.valueOf(firstValue) + Integer.valueOf(secondValue);
                textViewResult.setText(String.valueOf(result));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();

                int result = Integer.valueOf(firstValue) - Integer.valueOf(secondValue);
                textViewResult.setText(String.valueOf(result));

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();

                int result = Integer.valueOf(firstValue) * Integer.valueOf(secondValue);
                textViewResult.setText(String.valueOf(result));

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();

                double result = Double.valueOf(firstValue) / Double.valueOf(secondValue);
                textViewResult.setText(String.valueOf(result));

            }
        });

    }
}