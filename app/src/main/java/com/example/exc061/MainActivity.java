package com.example.exc061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        text = findViewById(R.id.text);
    }

    public void ace(View view) {
        text.setText("Oh, yea, I’ve been clicked!");
        text.setTextColor(Color.CYAN);

    }
}