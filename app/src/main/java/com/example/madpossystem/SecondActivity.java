package com.example.madpossystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private Button button3;
    public String statement;
    public EditText editText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button3 = (Button) findViewById(R.id.button7);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprocess3();
            }
        });
        editText5=(EditText) findViewById(R.id.editText5);
        editText5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statement=editText5.getText().toString();
            }
        });
    }
    public void openprocess3(){
        Intent intent1 = new Intent(this,ThirdActivity.class);
        startActivity(intent1);
    }
}
