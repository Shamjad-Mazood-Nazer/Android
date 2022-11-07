package com.example.loginformques01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SharedPreferencesQues05Activity extends AppCompatActivity {

    EditText fullname, emailid, password;
    RadioGroup gender_radioGroup;
    RadioButton male_gender, female_gender, others_gender;
    Button register_btn;
    TextView gender_error;
    LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_ques05);

        fullname= findViewById(R.id.fullname);
        emailid= findViewById(R.id.emailid);
        password= findViewById(R.id.password);
        gender_radioGroup= findViewById(R.id.gender_radioGroup);
        male_gender= findViewById(R.id.male_gender);
        female_gender= findViewById(R.id.female_gender);
        others_gender= findViewById(R.id.others_gender);
        register_btn= findViewById(R.id.register_btn);
        gender_error= findViewById(R.id.gender_error);
        main_layout= findViewById(R.id.main_layout);

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                main_layout.clearFocus();
                gender_error.setText("");
                String password_regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";
                String fullname_text= fullname.getText().toString();
                String emailid_text= emailid.getText().toString();
                String password_text= password.getText().toString();
                int gender_selected= gender_radioGroup.getCheckedRadioButtonId();

                if(fullname_text.equals("")){
                    fullname.requestFocus();
                    fullname.setError("Please enter fullname !!");
                }
                else if(fullname_text.length() < 3){
                    fullname.requestFocus();
                    fullname.setError("Fullname should be more than 2 characters !!");
                }
                else if(emailid_text.equals("")){
                    emailid.requestFocus();
                    emailid.setError("Please enter email-id !!");
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(emailid_text).matches()){
                    emailid.requestFocus();
                    emailid.setError("Please enter a valid email-id !!");
                }
                else if(gender_selected < 0){
                    gender_error.setText("Select anyone of the gender option !!");
                }
                else if(!password_text.matches(password_regex)){
                    password.requestFocus();
                    password.setError("Password should contain - \na digit must occur at least once\na lower case letter must occur at least once\nan upper case letter must occur at least once\na special character like @#$%^&+=\nNo blank spaces allowed\natleast 6 characters");
                }
                else{
                    fullname.setError("");
                    emailid.setError("");
                    gender_error.setText("");
                    password.setError("");

                    SharedPreferences pref= getSharedPreferences("register_data", MODE_PRIVATE);
                    SharedPreferences.Editor pref_edit= pref.edit();
                    pref_edit.putString("reg_fullname",fullname_text);
                    pref_edit.putString("reg_emailid",emailid_text);
                    pref_edit.putString("reg_password",password_text);
                    pref_edit.putInt("reg_gender",gender_selected);
                    pref_edit.apply();

                    Intent intent= new Intent(getApplicationContext(),SharedPreferencesResultPageActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

