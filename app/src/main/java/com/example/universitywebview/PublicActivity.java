package com.example.universitywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PublicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);


        //button initialize
        Button btnCuet = findViewById(R.id.btn_cuet);
        Button btnCu = findViewById(R.id.btn_cu);

        btnCuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,WebActivity.class);
                intent.putExtra("url","www.cuet.ac.bd/");
                startActivity(intent);
            }
        });


        btnCu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,WebActivity.class);
                intent.putExtra("url","www.cu.ac.bd/");
                startActivity(intent);
            }
        });
    }
}