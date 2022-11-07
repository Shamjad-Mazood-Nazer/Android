package com.example.optionsmenunavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ExceptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception);

        try{
            int n1=0, n2=0;
            int a= n1/n2;
            Toast.makeText(getApplicationContext(), "The value is : "+a, Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(), "The caught exception is : "+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
