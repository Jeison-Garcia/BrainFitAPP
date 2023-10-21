package com.example.brainfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity_Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_confirmation);

        TextView greeting_message = findViewById(R.id.greeting);
        TextView confirmation_message = findViewById(R.id.text_message);

        String user_name = getIntent().getStringExtra("Name");
        String gender = getIntent().getStringExtra("Gender");
        String email = getIntent().getStringExtra("Email");
        String password = getIntent().getStringExtra("Password");

        String hello = getString(R.string.welcome, user_name);
        greeting_message.setText(hello);

        String confirmation = getString(R.string.confirmation_message, email, password, gender);
        confirmation_message.setText(confirmation);
    }

    public void Exit(View view)
    {
        finish();
        System.exit(0);
    }
}