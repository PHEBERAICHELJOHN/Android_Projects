package com.example.phebe.exam_09;

import android.Manifest;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private static final int MY_PERMISSION_REQUEST_SEND_SMS=0;

    Button bt1;
    String phone,message;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bt1 = (Button)findViewById(R.id.button3);
        ed1 = (EditText)findViewById(R.id.editText); 

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSMSmessage();
            }
        });

    }

    public void sendSMSmessage()
    {
       phone = "8289985762";
       message = ed1.getText().toString();
       
       if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.SEND_SMS))
       {
       }
       else {
           ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSION_REQUEST_SEND_SMS);
       }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,  String[] permissions, int[] grantResults) {

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phone,null,message,null,null);
        Toast.makeText(this, "sms sent", Toast.LENGTH_SHORT).show();
    }
}
