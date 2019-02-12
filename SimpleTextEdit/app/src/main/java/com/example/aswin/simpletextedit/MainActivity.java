package com.example.aswin.simpletextedit;

import android.app.UiAutomation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonThree, buttonEquals, buttonAdd;
    int numberOne, numberTwo, result;
    EditText editTextOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonThree = findViewById(R.id.buttonThree);
        buttonEquals = findViewById(R.id.buttonEquals);
        buttonAdd = findViewById(R.id.buttonAdd);

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextOutput.setText(editTextOutput.getText().toString() + "3");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberOne = Integer.parseInt(editTextOutput.getText().toString());
                editTextOutput.setText("");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberTwo = Integer.parseInt(editTextOutput.getText().toString());
                result = numberOne + numberTwo;
                editTextOutput.setText(String.valueOf(result));
            }
        });
    }
}
