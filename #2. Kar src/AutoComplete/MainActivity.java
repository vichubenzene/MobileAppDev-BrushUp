package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.lv1);
        String[] country = new String[] {"Australia","America","UAE","USA","Australia","America","UAE","USA","Australia","America","UAE","USA","Australia","America","UAE","USA"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,country);
        l1.setAdapter(adapter);
    }
}