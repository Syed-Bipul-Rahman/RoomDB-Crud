package com.roomdb.roomdb;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    //declaring variables
    EditText id, name, email, contact;
    FloatingActionButton button;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializations of  variables
        id = findViewById(R.id.eid);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        button = findViewById(R.id.addtocontactbtn);
        message = findViewById(R.id.massage);


        //when user click on floating action button then contact should save in database
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    class bgthred extends Thread {
        public void run() {
            super.run();

            AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "userdatabase").build();
            UserDao userDao = db.userDao();

            //insert user into database


            userDao.insertUser(Integer.parseInt(id.getText().toString()), name.getText().toString(), email.getText().toString(), contact.getText().toString());

            //set all fields empty
            id.setText("");
            name.setText("");
            email.setText("");
            contact.setText("");
            message.setText("Inserted");
            message.setVisibility(View.VISIBLE);

        }
    }
}