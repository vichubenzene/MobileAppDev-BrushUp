package com.example.evaluatoin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;
    EditText sem,name,roll;
    RadioGroup rg;
    RadioButton r1,r2;
    TextView choice;
    String nothing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      name=findViewById(R.id.edt1);
      bt1=findViewById(R.id.submit);
      r1 = findViewById(R.id.btech);
      roll=findViewById(R.id.edt2);
      sem=findViewById(R.id.edt3);
      rg = findViewById(R.id.ug);
      choice = findViewById(R.id.choice);
      bt2 = findViewById(R.id.dynamic);
      bt2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              addEditText();
          }
      });
      bt1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            rg.clearCheck();
              Toast.makeText(getApplicationContext(),"Next page",Toast.LENGTH_LONG).show();

              acceptAll();
              if (acceptAll() == true){
                  nextPage();
              }
          }
      });


    }

    public void addEditText(){
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.newLayot);
        bt2 = new Button(MainActivity.this);
        bt2.setText("hifgg");
        linearLayout.addView(bt2);

    }

    public Boolean acceptAll(){
        int semmister = Integer.parseInt(sem.getText().toString());
        System.out.println(semmister);
        if(name.length()==0)
        {    name.setError("it cant be empty");
            return false;

        }
        else if(name.length()>0){
            for(int i=0;i<name.length();i++){
                char j=name.getText().toString().charAt(i);
                int b=(int) j;
                if(b>=97 && b<=122) {

                }
               else{
                   name.setError("Enter a alphabet");
                   return false;
                }
            }

        }
        if(semmister>8)
        {
            sem.setText("1");

        }
        int year = Integer.parseInt(roll.getText().toString().substring(7));
        int month = Integer.parseInt(roll.getText().toString().substring(3,5));
        int date = Integer.parseInt(roll.getText().toString().substring(0,2));
        System.out.println(month);
        if(month>12 || month<1){roll.setError("Enter a proper month"); return false;}
        if(date>31 || date<1){roll.setError("Enter a proper date"); return false;}
        if(year>18 && year<24){}else{roll.setError("Enter a year btw dwhe"); return false;}

        return true;
    }
    public void nextPage(){
        Intent j = new Intent(MainActivity.this,MainActivity2.class);
        j.putExtra("peru",name.getText().toString());
        startActivity(j);

    }
//    public void clicked(View view){
//        int radioId = rg.getCheckedRadioButtonId();
//        r1.findViewById(radioId);
//        r1.clearFocus();
//        Toast.makeText(getApplicationContext(),"Hello"+r1.getText(), Toast.LENGTH_SHORT).show();
//    }


}