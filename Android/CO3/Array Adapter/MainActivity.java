package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        String[] person_qualify = {"Front-End Developer", "Data Analyst", "Software Tester", "Software Developer", "Programming Analyst", "Web Developer", "Mobile App Developer", "Business Analyst", "Database Analyst"};

        listview = findViewById(R.id.listview);
        listview.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, person_qualify));
        listview.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "The qualification selected is - " + person_qualify[position], Toast.LENGTH_SHORT).show();
        });

    }
}
