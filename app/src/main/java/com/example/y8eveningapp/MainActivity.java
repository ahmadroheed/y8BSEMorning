package com.example.y8eveningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextusername,editTextpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckLogin(View view)
    {
        editTextusername = findViewById(R.id.Edittext_username);
        editTextpassword = findViewById(R.id.Edittext_password);

        String username = editTextusername.getText().toString();
        String password = editTextpassword.getText().toString();

        // username:Admin password:123

        if(username.equals("Admin") && password.equals("123"))
        {
            Toast.makeText(this, "Welcome your username and password is correct!", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }

    }
}