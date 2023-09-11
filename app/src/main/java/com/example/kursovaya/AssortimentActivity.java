package com.example.kursovaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AssortimentActivity extends AppCompatActivity {

    Button btnStenFas, btnKrovlya, btnTeploizol, btnSuhieSmessi, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assortiment);

        btnStenFas = findViewById(R.id.stroy_mat_fas);
        btnKrovlya = findViewById(R.id.krovlya);
        btnTeploizol = findViewById(R.id.teploizol);
        btnSuhieSmessi = findViewById(R.id.suhie_smessi);
        btnBack = findViewById(R.id.backBtn);

        btnStenFas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssortimentActivity.this, StenovieFasadi.class));
            }
        });

        btnKrovlya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssortimentActivity.this, KrovlyaActivity.class));
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssortimentActivity.this, MenuActivity.class));
            }
        });

        btnTeploizol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssortimentActivity.this, TeploActivity.class));
            }
        });

        btnSuhieSmessi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AssortimentActivity.this, DryActivity.class));
            }
        });
    }
}