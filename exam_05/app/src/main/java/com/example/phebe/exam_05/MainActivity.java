package com.example.phebe.exam_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    String message;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(b);
            }
        });

        Intent intent = getIntent();
        message = intent.getStringExtra("abc");

        if(message!=null)
        {
            tv=(TextView)findViewById(R.id.textView);
            tv.setText(message);
            Toast.makeText(this, "believe" + message, Toast.LENGTH_SHORT).show();
        }
    }
}
