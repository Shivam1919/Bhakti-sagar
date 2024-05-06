package com.example.bhaktisagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.hanumanchalisa);
        btn2 = findViewById(R.id.sundarkand);
        btn3 = findViewById(R.id.Ramstuti);
        btn4 = findViewById(R.id.hanumanaarti);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, hanumanchalisa.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sundarkand = new Intent(MainActivity.this, sundarkand.class);
                startActivity(sundarkand);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ram = new Intent(MainActivity.this,ramstuti.class);
                startActivity(ram);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arti = new Intent(MainActivity.this, aarti.class);
                startActivity(arti);
            }
        });
    }
}