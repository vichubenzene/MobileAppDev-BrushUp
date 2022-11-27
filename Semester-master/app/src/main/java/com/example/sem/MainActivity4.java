package com.example.sem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    EditText name,phone,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        name = findViewById(R.id.getName);
        phone = findViewById(R.id.getPhone);
        email = findViewById(R.id.getEmail);
        Button cont = findViewById(R.id.cntSaver);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate() == true){
                    Intent i = new Intent(Intent.ACTION_INSERT);
                    final String contacts = ContactsContract.Contacts.NAME_RAW_CONTACT_ID;
                    i.setType(ContactsContract.RawContacts.CONTENT_TYPE);
                    i.putExtra(ContactsContract.Intents.Insert.NAME,name.getText().toString());
                    i.putExtra(ContactsContract.Intents.Insert.PHONE,phone.getText().toString());
                    i.putExtra(ContactsContract.Intents.Insert.EMAIL,email.getText().toString());
                    startActivity(i);
                }
            }
        });

        String[] names = {"Rishi","Golu","Adi"};
        ListView lv = findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);


        Button seeURL = findViewById(R.id.urls);
        EditText text = findViewById(R.id.getURL);
        seeURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url;
                url = text.getText().toString();
                Intent i;
                if(url.startsWith("http://"))
                    i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                else
                    i = new Intent(Intent.ACTION_VIEW,Uri.parse("http://"+url));
                startActivity(i);

            }
        });

        Button share = findViewById(R.id.shareAll);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String shareBody = "Whatever the fuk u want u share";
                String sub = "Type ur all tensions here";
                i.putExtra(Intent.EXTRA_SUBJECT,sub);
                i.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(i,"Share Using"));
            }
        });

        RecyclerView rv=findViewById(R.id.recyclerview);
        List<String> name=new ArrayList<String>();
        name.add("Amrita"); name.add("Amrita1"); name.add("Amrita2");
        name.add("Amrita3"); name.add("Amrita4");
        rv.setLayoutManager(new LinearLayoutManager(this ));
        MyAdapter Recycleadapter=new MyAdapter(this,name);
        rv.setAdapter(Recycleadapter);
    }

    private boolean validate() {
        if(name.getText().length()==0 && phone.getText().length()==0 && email.getText().length()==0){
            name.setError("Type a name");
            return false;
        }
        return true;
    }
}