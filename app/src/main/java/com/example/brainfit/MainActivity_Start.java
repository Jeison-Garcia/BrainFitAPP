package com.example.brainfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_start);
    }

    public void signUpAction(View view)
    {
        Intent signup = new Intent(this, MainActivity_Form.class);
        startActivity(signup);
    }
}