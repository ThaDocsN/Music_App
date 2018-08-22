package com.example.charles.musicappredo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btHipHop = findViewById(R.id.btnHipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.btnRB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.btnReggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.btnCountry);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CountryActivity.class));
            }
        });
    }
}
