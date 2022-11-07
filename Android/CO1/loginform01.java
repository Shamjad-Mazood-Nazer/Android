package com.example.loginform01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variable Creation
    EditText username,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variables Initializatxions
        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        login= findViewById(R.id.login);

        // Below code works when user clicks on the login button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username_text= username.getText().toString();
                String password_text= password.getText().toString();
                Toast.makeText(MainActivity.this, "Login Successful.\nUsername is : "+username_text+"\nPassword is : "+password_text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
