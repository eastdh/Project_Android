package com.eastdh.loaminicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button orehaButton = findViewById(R.id.orehaButton);
        Button gakinButton = findViewById(R.id.gakinButton);
        Button jewelButton = findViewById(R.id.jewelButton);

        orehaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrehaActivity.class);
                startActivity(intent);
            }
        });
        gakinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GakinActivity.class);
                startActivity(intent);
            }
        });
        jewelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JewelActivity.class);
                startActivity(intent);
            }
        });
    }
}