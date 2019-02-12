package com.example.mcaguest.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
         message = intent.getStringExtra("abc");

        if(message!=null)
        {
            TextView textView = findViewById(R.id.textView2);
            textView.setText(message);
        Toast.makeText(this, "hi"+message, Toast.LENGTH_SHORT).show();}

    }

    public void nav5(View View)
    {
        Intent intent = new Intent(this, Q5.class);
        startActivity(intent);
    }


}