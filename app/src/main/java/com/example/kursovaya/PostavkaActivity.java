package com.example.kursovaya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class PostavkaActivity extends AppCompatActivity {
    Button addMatBtn, menuBtn;
    TextInputLayout order;
    ConstraintLayout root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postavka);

        addMatBtn = findViewById(R.id.addMatBtn);
        menuBtn = findViewById(R.id.menuBtn);
        order = findViewById(R.id.order);
        root = findViewById(R.id.root_element);

        addMatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                order.getEditText().setText("");
                Snackbar.make(root, "Поставка заказана!", Snackbar.LENGTH_SHORT).show();
            }
        });

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PostavkaActivity.this, MenuActivity.class));
            }
        });

    }
}