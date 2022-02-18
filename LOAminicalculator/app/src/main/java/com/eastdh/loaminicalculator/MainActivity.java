package com.eastdh.loaminicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button orehaButton = findViewById(R.id.orehaButton);
    Button settingButton = findViewById(R.id.settingButton);
    Button jewelButton = findViewById(R.id.jewelButton);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orehaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrehaActivity.class);
                startActivity(intent);
            }
        });
    }
}