package com.example.phebe.exam_11;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech t1;
    Button b1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button);


        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                     if (status!= TextToSpeech.ERROR)
                     {
                         t1.setLanguage(Locale.UK);
                     }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tospeak = e1.getText().toString();
                Toast.makeText(MainActivity.this, tospeak, Toast.LENGTH_SHORT).show();
                t1.speak(tospeak,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }

 /*  public void onPause()
    {
        if (t1!=null)
        {
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }   */

}
