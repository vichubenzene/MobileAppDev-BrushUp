package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText etxt1,etxt2;
    CheckBox cb1,cb2,cb3,cb4;
    RadioGroup rgb;
    RadioButton rbb1,rbb2,rbb3;
    Button bton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bton1=findViewById(R.id.bton);
        etxt1=findViewById(R.id.et1);
        etxt2=findViewById(R.id.et2);
        rgb=findViewById(R.id.rg);
        cb1=findViewById(R.id.c1);
        cb2=findViewById(R.id.c2);
        cb3=findViewById(R.id.c3);
        cb4=findViewById(R.id.c4);
        rbb1=findViewById(R.id.r1);
        rbb2=findViewById(R.id.r2);
        rbb3=findViewById(R.id.r3);

        bton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = etxt1.getText().toString();
                String s2 = etxt2.getText().toString();
                int checkedId=rgb.getCheckedRadioButtonId();
                String s3 = null;
                switch (checkedId){
                    case R.id.r1:
                        s3=rbb1.getText().toString();
                        break;
                    case R.id.r2:
                        s3=rbb2.getText().toString();
                        break;
                    case R.id.r3:
                        s3=rbb3.getText().toString();
                        break;
                }
                String s4=null;
                if(cb1.isChecked()){
                    s4=cb1.getText().toString();
                }
                if(cb2.isChecked()){
                    s4=cb2.getText().toString();
                }
                if(cb3.isChecked()){
                    s4=cb3.getText().toString();
                }
                if(cb4.isChecked()){
                    s4=cb4.getText().toString();
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("key1",s1);
                intent.putExtra("key2",s2);
                intent.putExtra("key3",s3);
                intent.putExtra("key4",s4);
                startActivity(intent);





            }});

    }
}