package com.example.jamalfedaoui_cardiodiagnostics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

    }

    public void Submit(View v){
        String FirstName = ((EditText)findViewById(R.id.edtFirstName)).getText().toString();

        String LastName = ((EditText)findViewById(R.id.edtLastName)).getText().toString();

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("FirstName", FirstName);
        i.putExtra("LastName", LastName);
        startActivity(i);

    }
}
