package com.example.zbook.currencycalculator;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //final EditText farhen = (EditText) findViewById(R.id.editText1);
        //final EditText celci = (EditText) findViewById(R.id.editText2);

        //Button Buttonconvert = (Button) findViewById(R.id.convertButton);

//        Buttonconvert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                double value1 = Double.valueOf(farhen.getText().toString());
//                //double  value2 = Double.valueOf(celci.getText().toString());
//
//                double answer = (value1 - 32)  / 1.8;
//                celci.setText(String.valueOf (answer));
//                celci.setEnabled(false);
//
////                NotificationManager notificationManager = getSystemService(MainActivity.this.notify());
////                NotificationManager.createNo
//            }
//        });

    }
}
