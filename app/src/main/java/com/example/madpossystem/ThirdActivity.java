package com.example.madpossystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.madpossystem.R.*;
import static com.example.madpossystem.R.id.*;

public class ThirdActivity extends AppCompatActivity {
    private TextView textview10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_third);
        textview10 = (TextView) findViewById(textView10);
        textview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview10.setText(getIntent().getStringExtra("statement"));
            }
        });
    }
}
