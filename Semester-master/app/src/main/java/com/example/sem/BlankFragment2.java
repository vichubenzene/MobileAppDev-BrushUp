package com.example.sem;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class BlankFragment2 extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank2, container, false);
        EditText text = v.findViewById(R.id.getData);
        Button btn = v.findViewById(R.id.sendData);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences= getActivity().getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("Info",text.getText().toString());
                editor.commit();
            }
        });

        return  v;
    }
}