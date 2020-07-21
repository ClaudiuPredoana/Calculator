package com.predoana.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.et_firstNumber);
        EditText editText1 = findViewById(R.id.et_secondNumber);
        Button button = findViewById(R.id.btn_add);
        TextView textView = findViewById(R.id.result);
        

    }
}