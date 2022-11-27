package com.example.sem;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String i = getIntent().getStringExtra("Nothing");
        System.out.println(i);
        Button btn = findViewById(R.id.frags);
        EditText name = findViewById(R.id.name);
        EditText number = findViewById(R.id.number);
        RadioButton btch = findViewById(R.id.btch);
        RadioButton mtch = findViewById(R.id.mtch);



        Button getBtn = findViewById(R.id.getInfo);
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity2.this);
        Button alert = findViewById(R.id.alert);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.setTitle("Alert Creator");
                alertDialog.setMessage("Are you sure you want delete this?");
                alertDialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"No Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Yes Clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });





        String[] lang = {"mALAYALAM","eNGLISH"};
        Button checkAlert = findViewById(R.id.alertCheck);
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity2.this);
        checkAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setMultiChoiceItems(lang, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        Toast.makeText(getApplicationContext(),"Language: "+lang[i],Toast.LENGTH_SHORT).show();

                    }
                });
                dialog.show();
            }
        });







    }



}