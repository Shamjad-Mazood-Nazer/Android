package com.example.calculatormain;

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
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,addition,subtraction,multiplication,division,modulus;
    double num3,num4,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= (EditText)findViewById(R.id.n1);
        num2= (EditText)findViewById(R.id.n2);
        answer= (TextView)findViewById(R.id.result);

        btn0= (Button) findViewById(R.id.bt0);
        btn1= (Button) findViewById(R.id.bt1);
        btn2= (Button) findViewById(R.id.bt2);
        btn3= (Button) findViewById(R.id.bt3);
        btn4= (Button) findViewById(R.id.bt4);
        btn5= (Button) findViewById(R.id.bt5);
        btn6= (Button) findViewById(R.id.bt6);
        btn7= (Button) findViewById(R.id.bt7);
        btn8= (Button) findViewById(R.id.bt8);
        btn9= (Button) findViewById(R.id.bt9);

        addition= (Button) findViewById(R.id.add);
        subtraction= (Button) findViewById(R.id.sub);
        multiplication= (Button) findViewById(R.id.mul);
        division= (Button) findViewById(R.id.div);
        modulus= (Button) findViewById(R.id.mod);

        addition.setOnClickListener(new View.OnClickListener() {
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

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                String value2=num2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a-b;
                answer.setText(Integer.toString(sum));
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                String value2=num2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a*b;
                answer.setText(Integer.toString(sum));
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                String value2=num2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a/b;
                answer.setText(Integer.toString(sum));
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=num1.getText().toString();
                String value2=num2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a%b;
                answer.setText(Integer.toString(sum));
                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}