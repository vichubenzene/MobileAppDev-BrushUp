package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.tv1);
        txt2=findViewById(R.id.tv2);
        txt3=findViewById(R.id.tv3);
        txt4=findViewById(R.id.tv4);
        String s3=getIntent().getStringExtra("key1");
        String s4=getIntent().getStringExtra("key2");
        String s5=getIntent().getStringExtra("key3");
        String s6=getIntent().getStringExtra("key4");
        txt1.setText(s3);
        txt2.setText(s4);
        txt3.setText(s5);
        txt4.setText(s6);
    }
}