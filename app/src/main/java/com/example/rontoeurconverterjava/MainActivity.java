package com.example.rontoeurconverterjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputValue;
    private Button calculateButton;
    private TextView outputValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        inputValue = findViewById(R.id.inputValue);
        calculateButton = findViewById(R.id.calculateButton);
        outputValue=findViewById(R.id.outputValue);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = Double.parseDouble(inputValue.getText().toString());
                double result = value/4.8;
                outputValue.setText(String.valueOf(result));
            }
        });
    }


}