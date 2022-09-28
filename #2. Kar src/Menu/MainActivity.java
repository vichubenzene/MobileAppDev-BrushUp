package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menulist,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1",Toast.LENGTH_LONG).show();break;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Item 2",Toast.LENGTH_LONG).show();break;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Item 3",Toast.LENGTH_LONG).show();break;
            case R.id.item4:
                Toast.makeText(getApplicationContext(),"Item 4",Toast.LENGTH_LONG).show();break;
            case R.id.item5:
                Toast.makeText(getApplicationContext(),"Item 5",Toast.LENGTH_LONG).show();break;
            case R.id.item41:
                Toast.makeText(getApplicationContext(),"Sub Item 1",Toast.LENGTH_LONG).show();break;
            case R.id.item42:
                Toast.makeText(getApplicationContext(),"Sub Item 2",Toast.LENGTH_LONG).show();break;
            case R.id.item43:
                Toast.makeText(getApplicationContext(),"Sub Item 3",Toast.LENGTH_LONG).show();break;
        }
        return super.onOptionsItemSelected(item);
    }
}