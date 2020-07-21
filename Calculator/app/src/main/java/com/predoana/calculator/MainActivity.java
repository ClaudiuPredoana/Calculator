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


    }
}