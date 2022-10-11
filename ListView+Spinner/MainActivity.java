package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Spinner sp;
    String tut[]={
            "version","Android","version","Android","version","Android","version","Android","version","Android","version","Android","version","Android","version","Android","version","Android","version","Android"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        ArrayAdapter<String> arr;
        arr= new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,tut);

        lv.setAdapter(arr);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "i will buy"+ arr.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });

        sp = findViewById(R.id.spin);
        ArrayAdapter<String> arr1;
        arr1=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,tut);
        sp.setAdapter(arr1);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"selected"+arr1.getItem(i),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,"NO",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
