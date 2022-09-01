package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit, cl;
    EditText name, rno, dob, sem;
    CheckBox ai, ip, sec;
    RadioGroup study;
    RadioButton check_select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        cl = findViewById(R.id.clear);
        ai = findViewById(R.id.ai);
        ip = findViewById(R.id.ip);
        sec = findViewById(R.id.sec);
        study = findViewById(R.id.rg);
        name = findViewById(R.id.name);
        rno = findViewById(R.id.rno);
        dob = findViewById(R.id.dob);
        sem = findViewById(R.id.sem);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.getText().clear();
                rno.getText().clear();
                dob.getText().clear();
                sem.getText().clear();
                study.clearCheck();
                ai.setChecked(false);
                ip.setChecked(false);
                sec.setChecked(false);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                if(!n.matches("^[a-zA-Z ]*$")){
                    name.setError("Enter only Alphabets");
                }
                String r = rno.getText().toString();
                 if(!r.matches("^(CB.EN.U4)[A-Z]{3}[0-9]{5}$")){
                    rno.setError("Enter valid Rno");
                }
                String d = dob.getText().toString();
                 Toast.makeText(getApplicationContext(),d,Toast.LENGTH_LONG).show();
                if(!d.matches("\\d{2}\\/\\d{2}\\/\\d{4}")){

                    dob.setError("Enter valid Date");
                }
            }
        });
    }

    public void course_mtech(View V) {
        ai.setText("AI");
        ip.setText("Image Processing");
        sec.setVisibility(View.VISIBLE);
        sec.setText("Security");
    }
        public void course_btech(View V){
            ai.setText("Core");
            ip.setText("Elective");
            sec.setVisibility(View.INVISIBLE);
        }


}