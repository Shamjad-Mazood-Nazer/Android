package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText rollno, name, email;
    Button insert, view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollno = (EditText) findViewById(R.id.roll_no);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);

        insert = (Button) findViewById(R.id.insert);
        view = (Button) findViewById(R.id.view);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String RollNo = rollno.getText().toString();
                Integer myno = Integer.parseInt(RollNo);
                String Name = name.getText().toString();
                String Email = name.getText().toString();

                dataBaseConnection conn = new dataBaseConnection(getApplicationContext());
                boolean insert_result = conn.insertUserData(myno, Name, Email);

                if(insert_result == true){
                    Toast.makeText(MainActivity.this, "Insertion Successful", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Insertion Failed", Toast.LENGTH_LONG).show();
            }
        });
    }
}