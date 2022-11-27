package com.example.sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button insert_sigle,delete,get_all,update,insert_multiple,find_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intent = findViewById(R.id.next);
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =  new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("Nothing",100);
                startActivity(i);

            }
        });

        insert_sigle=findViewById(R.id.insert_single);
        insert_sigle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Todo todo = new Todo("make a video on swift ...", false);
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        TodoRoomDatabase.getInstance(getApplicationContext()).todoDao().insertTodo(todo);
                    }
                });
                thread.start();

            }
        });
        delete=findViewById(R.id.delete_single);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        get_all=findViewById(R.id.get_all);
        get_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        List<Todo> todoList = TodoRoomDatabase.getInstance(getApplicationContext()) .todoDao() .getAllTodos();
                        Log.d(TAG, "run: " + todoList.toString());

                    }
                });
                thread.start();
            }
        });
        update=findViewById(R.id.update_single);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        insert_multiple=findViewById(R.id.insert_multiple);
        insert_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        find_all=findViewById(R.id.find_complted);
        find_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}