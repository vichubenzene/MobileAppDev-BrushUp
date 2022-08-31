package com.example.teach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton r1,r2;
    LinearLayout l1,l2;
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.rb1);
        r2 = findViewById(R.id.rb2);
        l1 = findViewById(R.id.ll1);
        l2 = findViewById(R.id.ll2);
        b1 = findViewById(R.id.bton);
        b2 = findViewById(R.id.bton2);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
        rg = findViewById(R.id.rg);
        e1.addTextChangedListener(txt);
        e2.addTextChangedListener(txt);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                r1.setChecked(false);
                r2.setChecked(false);
                l1.removeAllViews();
                l2.removeAllViews();
            }
        });

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioButton r3,r4;
                r3 = new RadioButton(MainActivity.this);
                r3.setText("Core");
                r4 = new RadioButton(MainActivity.this);
                r4.setText("Elective");
                l1.addView(r3);
                l1.addView(r4);
                l2.removeAllViews();
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox c1,c2,c3;
                c1 = new CheckBox(MainActivity.this);
                c2 = new CheckBox(MainActivity.this);
                c3 = new CheckBox(MainActivity.this);
                c1.setText("AI");
                c2.setText("Image Processing");
                c3.setText("Security");
                l2.addView(c1);
                l2.addView(c2);
                l2.addView(c3);
                l1.removeAllViews();
            }
        });
    }
    
    private TextWatcher txt = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String s = e1.getText().toString();
            String r = e2.getText().toString();
           //Log.d("_log",r);
            int a = Integer.parseInt(r);
            //Log.d("_log",""+a);
            if (r.matches("9")||r.matches("0")||r.length()>1){
                r="1";
                e2.setText(r);
            }
            b1.setEnabled(s.matches("[a-zA-Z]+")&&!r.isEmpty());

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}