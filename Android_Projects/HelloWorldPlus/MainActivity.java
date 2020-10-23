package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if EditText etc. here, not avialable to onBtnClick method
    }


    public void onBtnClick(View view) {
        //added view for text, then moved to here
        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        txtFirstName.setText("First name is " + editTextFirstName.getText().toString());

        TextView txtLastName = findViewById(R.id.textViewLastName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        txtLastName.setText("Last name is " + editTextLastName.getText().toString());

        TextView txtEmail = findViewById(R.id.textViewEmail);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        txtEmail.setText("Email is " + editTextEmail.getText().toString());

    }
}