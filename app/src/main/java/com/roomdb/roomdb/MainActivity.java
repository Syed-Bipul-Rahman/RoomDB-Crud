package com.roomdb.roomdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //declaring variables
    EditText id,name,email,contact;
    FloatingActionButton button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializations of  variables
        id=findViewById(R.id.eid);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        contact=findViewById(R.id.contact);
        button=findViewById(R.id.addtocontactbtn);


        //when user click on floating action button then contact should save in database
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}