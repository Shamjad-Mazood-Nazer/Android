package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    TextView answer;
    Button btn;
    double num3,num4,sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username= (EditText)findViewById(R.id.email);
        password= (EditText)findViewById(R.id.password);
        btn=(Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=username.getText().toString();
                String value2=password.getText().toString();

                if (username.getText().toString().equals("admin@email.com") && password.getText().toString().equals("Admin@123")) {
                    Toast.makeText(getApplicationContext(),"Congratulations!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Sorry, invalid!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

