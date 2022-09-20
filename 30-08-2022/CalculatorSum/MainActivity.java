package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView answer;
    Button btn;
    double num3,num4,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= (EditText)findViewById(R.id.n1);
        num2= (EditText)findViewById(R.id.n2);
        answer=(TextView)findViewById(R.id.showsum);
        btn=(Button) findViewById(R.id.sum);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                String value2=num2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a+b;
                answer.setText(Integer.toString(sum));
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}