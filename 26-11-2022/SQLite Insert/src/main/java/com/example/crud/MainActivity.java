package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseConnection DB = new dataBaseConnection(this);
        EditText name = findViewById(R.id.name);
        EditText id = findViewById(R.id.uid);
        EditText email = findViewById(R.id.email);
        Button insert = findViewById(R.id.insert);
        Button view = findViewById(R.id.view);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nametxt = name.getText().toString();
                String idtxt = id.getText().toString();
                String emailtxt = email.getText().toString();
                Boolean checkinsertdata = DB.insertUserData(idtxt, nametxt, emailtxt);
                if (checkinsertdata) {
                    Toast.makeText(MainActivity.this, "Data inserted successfully",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}