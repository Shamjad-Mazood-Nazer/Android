package com.example.loginformques01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SharedPreferencesResultPageActivity extends AppCompatActivity {

    TextView fullname_result, emailid_result, gender_result, password_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_result_page);

        fullname_result= findViewById(R.id.fullname_result);
        emailid_result= findViewById(R.id.emailid_result);
        gender_result= findViewById(R.id.gender_result);
        password_result= findViewById(R.id.password_result);

        SharedPreferences pref= getSharedPreferences("register_data", MODE_PRIVATE);
        String name= pref.getString("reg_fullname","Sample Name");
        String email= pref.getString("reg_emailid","Sample Email");
        String password= pref.getString("reg_password","Sample Password");
        int gender_id= pref.getInt("reg_gender",0);

        String gender;
        if(gender_id==0)
            gender= "Male";
        else if(gender_id==1)
            gender= "Female";
        else if(gender_id==2)
            gender= "Others";
        else
            gender="Sample Gender";

        fullname_result.setText(name);
        emailid_result.setText(email);
        gender_result.setText(gender);
        password_result.setText(password);
    }
}
