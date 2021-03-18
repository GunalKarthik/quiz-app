package com.gunalkarthikraj.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button btn;
    CheckBox check1;
    Image image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    e1=(EditText)findViewById(R.id.EditText1);
    e2=(EditText)findViewById(R.id.editText2);
    check1=(CheckBox)findViewById(R.id.checkbox);


    check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked)
            {
                e2.setTransformationMethod(null);
            }
            else
            {
                e2.setTransformationMethod(new PasswordTransformationMethod());
            }
        }
    });
    }
    public void click(View v)
    {
        String username,password;
        username=e1.getText().toString();
        password=e2.getText().toString();
        if (username.isEmpty() && password.isEmpty()){
            Toast.makeText(this,"Enter Email or Password",Toast.LENGTH_SHORT).show();
        }
        if (username.equals("gunalsancs@gmail.com")&& password.equals("karthikraj"))
        {
            Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Invalid User Found",Toast.LENGTH_SHORT).show();
        }
    }
    public void newuser (View vi){
        Toast.makeText(this,"Wait For Creating Intent Class",Toast.LENGTH_SHORT).show();
    }
}