package com.example.sem;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends
        RecyclerView.ViewHolder {
    TextView textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        textView=itemView.findViewById(R.id.tv);
    }
}