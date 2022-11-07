package com.example.optionsmenunavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int menu_id= item.getItemId();
        switch (menu_id){
            case R.id.second_activity:{
                Intent intent= new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.third_activity:{
                Intent intent= new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.fourth_activity:{
                Intent intent= new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);
                break;
            }
            default:{
                Intent intent= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
            }
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return super.onCreateOptionsMenu(menu);
    }
}

