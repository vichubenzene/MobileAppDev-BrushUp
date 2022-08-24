package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        t1=findViewById(R.id.tv1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1;
                Integer a1;
                s1 = t1.getText().toString();
                a1= Integer.parseInt(s1);
                a1+=1;
                t1.setText(String.valueOf(a1) );
                Toast.makeText(getApplicationContext(),String.valueOf(a1),Toast.LENGTH_SHORT).show();
            }
        });
    }
}