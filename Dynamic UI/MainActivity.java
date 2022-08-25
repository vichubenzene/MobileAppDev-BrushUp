package com.example.add_controls_dynamically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btn1,newbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addButton();
            }
        });
    }
    public void addButton() {
        LinearLayout lin = (LinearLayout) findViewById(R.id.linearLayout1);
        newbtn = new Button(this);
        newbtn.setText("New Button");
        lin.addView(newbtn);
    }
}