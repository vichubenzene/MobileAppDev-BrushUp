package com.example.frag_comm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String i) {
        FragmentManager fm = getSupportFragmentManager();
        fragment2 f2 = (fragment2)fm.findFragmentById(R.id.frag2);
        f2.changedata(i);
    }
}