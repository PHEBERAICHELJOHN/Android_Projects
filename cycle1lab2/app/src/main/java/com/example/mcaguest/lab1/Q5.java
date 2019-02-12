package com.example.mcaguest.lab1;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Q5 extends AppCompatActivity {

    String message;
    EditText ed;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        b1=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed  = (EditText) findViewById(R.id.editText);
                message = ed.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                 intent.putExtra("abc",message);
                startActivity(intent);
            }
        });

    }
}
