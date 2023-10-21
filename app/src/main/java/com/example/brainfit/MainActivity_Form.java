package com.example.brainfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_Form extends AppCompatActivity {

    private EditText fName, email, password;
    private RadioGroup Gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);

        fName = findViewById(R.id.NameInput);
        Gender = (RadioGroup) findViewById(R.id.GenderInput);
        email = findViewById(R.id.EmailInput);
        password = findViewById(R.id.PasswordInput);
    }

    public void closeForm(View view)
    {
        Intent cancelForm = new Intent(this, MainActivity_Start.class);
        startActivity(cancelForm);
    }

    public void sendForm(View view)
    {
        String name = fName.getText().toString();
        String gender = ((RadioButton)findViewById(Gender.getCheckedRadioButtonId())).getText().toString();
        String e_mail = email.getText().toString();
        String pswrd = password.getText().toString();

        Intent sendForm = new Intent(this, MainActivity_Confirmation.class);
        sendForm.putExtra("Name", name);
        sendForm.putExtra("Gender", gender);
        sendForm.putExtra("Email", e_mail);
        sendForm.putExtra("Password", pswrd);
        startActivity(sendForm);
    }
}