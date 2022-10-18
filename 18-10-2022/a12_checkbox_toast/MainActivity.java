package com.example.a12_checkbox_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox data1;
    CheckBox data2;
    CheckBox data3;
    CheckBox data4;
    CheckBox data5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data1 =findViewById(R.id.sing);
        data2 =findViewById(R.id.write);
        data3 =findViewById(R.id.drive);
        data4 =findViewById(R.id.code);
        data5 =findViewById(R.id.game);



    }
}