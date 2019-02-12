package com.example.phebe.exam_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bequ;
    EditText ed1;
    int val1,val2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button4);
        b4 = (Button)findViewById(R.id.button5);
        b5 = (Button)findViewById(R.id.button6);
        b6 = (Button)findViewById(R.id.button7);
        b7 = (Button)findViewById(R.id.button8);
        b8 = (Button)findViewById(R.id.button9);
        b9 = (Button)findViewById(R.id.button10);
        b0 = (Button)findViewById(R.id.button11);

        badd = (Button)findViewById(R.id.button12);
        bsub = (Button)findViewById(R.id.button13);
        bmul = (Button)findViewById(R.id.button14);
        bdiv = (Button)findViewById(R.id.button15);
        bequ = (Button)findViewById(R.id.button16);

        ed1 = (EditText)findViewById(R.id.editText);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                val1 = Integer.parseInt(ed1.getText()+"");
                add=true;
                ed1.setText(null);
            }
        });
    bequ.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            val2=Integer.parseInt(ed1.getText()+"");
            if(add==true)
            {
                ed1.setText(val1+val2+"");
                add=false;
            }
        }
    });


    }
}
