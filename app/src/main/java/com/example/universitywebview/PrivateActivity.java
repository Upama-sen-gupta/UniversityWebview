package com.example.universitywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrivateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);


        Button btnIiuc = findViewById(R.id.btn_iiuc);
        Button btnPciu = findViewById(R.id.btn_pciu);
        Button btnPremier = findViewById(R.id.btn_premier);

        btnIiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,WebActivity.class);
                intent.putExtra("url","www.iiuc.ac.bd/");
                startActivity(intent);


            }
        });

        btnPciu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,WebActivity.class);
                intent.putExtra("url","www.portcity.edu.bd/");
                startActivity(intent);
            }
        });

        btnPremier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,WebActivity.class);
                intent.putExtra("url","www.puc.ac.bd/");
                startActivity(intent);
            }
        });

    }
}