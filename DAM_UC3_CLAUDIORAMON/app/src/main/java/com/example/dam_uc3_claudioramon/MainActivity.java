package com.example.dam_uc3_claudioramon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.BtnRegistrate);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Datos Registrados", Toast.LENGTH_SHORT).show());

    }
}