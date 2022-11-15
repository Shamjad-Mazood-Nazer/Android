package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText rollno, name, email;
    Button update, delete, view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollno = (EditText) findViewById(R.id.roll_no);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);

        update = (Button) findViewById(R.id.update);
        delete = (Button) findViewById(R.id.delete);
        view = (Button) findViewById(R.id.view);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String RollNo = rollno.getText().toString();
                String Name = name.getText().toString();
                String Email = name.getText().toString();

                dataBaseConnection conn = new dataBaseConnection(getApplicationContext());
            }
        });
    }
}