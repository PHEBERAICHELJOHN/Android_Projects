package com.example.mcaguest.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Welcome    "+ getIntent().getExtras().getString("username"));
    }
}
