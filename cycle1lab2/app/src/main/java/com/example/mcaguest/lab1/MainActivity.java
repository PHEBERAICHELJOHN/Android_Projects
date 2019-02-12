package com.example.mcaguest.lab1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "Hellow......" , Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button);

        final EditText edUsername  = (EditText) findViewById(R.id.editText2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lab2 = new Intent(MainActivity.this,Second.class);
                lab2.putExtra("username",edUsername.getText().toString());
                startActivity(lab2);

            }
        });



    }
public void nav(View View)
{
    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
    startActivity(browserIntent);
}

public void nav2(View View)
{
        Intent lab3 = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(lab3);
}
}
