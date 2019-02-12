package com.example.phebe.ques_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    TextView tv;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });


        Intent intent = getIntent();
        message = intent.getStringExtra("username");

        if(message!=null)
        {
            tv = (TextView)findViewById(R.id.textView);
            tv.setText(message);
            Toast.makeText(this, "WELCOME " + message, Toast.LENGTH_SHORT).show();
        }
    }
}
