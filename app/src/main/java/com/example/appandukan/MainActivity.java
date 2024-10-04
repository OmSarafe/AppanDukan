package com.example.appandukan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    TextView tvSignup, tvForgotPassword;
    ImageView ivFacebook,  ivGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        tvSignup = findViewById(R.id.tv_signup);
        tvForgotPassword = findViewById(R.id.tv_forgot_password);


        // Login button click event
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle login logic here
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Sign-up text click event
        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle signup logic here
                Toast.makeText(MainActivity.this, "Signup clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Forgot password text click event
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle forgot password logic here
                Toast.makeText(MainActivity.this, "Forgot password clicked", Toast.LENGTH_SHORT).show();
            }
        });

        // Social media icons click event
    }
}
