package com.example.shared_pref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = findViewById(R.id.b2);
        e1 = findViewById(R.id.ett1);
        e2 = findViewById(R.id.ett2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sf = getSharedPreferences("myfile", Context.MODE_PRIVATE);
                String u = sf.getString("Uname","NA");
                String p = sf.getString("pw","NA");
                e1.setText(u);
                e2.setText(p);
            }
        });
    }
}