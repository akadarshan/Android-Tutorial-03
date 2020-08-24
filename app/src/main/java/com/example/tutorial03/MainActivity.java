package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText login_email,login_password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_email = findViewById(R.id.login_email);
        login_password = findViewById(R.id.login_password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login_email.getText().toString().equals("admin@gmail.com") && login_password.getText().toString().equals("admin")){
                    startActivity(new Intent(MainActivity.this,welcome.class));
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"Invalid Username OR Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}