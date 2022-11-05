package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> list=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("ITEM 1");
        list.add("ITEM 2");
        list.add("ITEM 3");
        list.add("ITEM 4");

        for (int i=0; i<5; i++){
            try {
                list.get(i);
            }
            catch (Exception e){
                Toast.makeText(this,"Exception caught",Toast.LENGTH_LONG).show();
            }
        }
    }
}