package com.example.madpossystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    private Button button1;  
    private Button button2;
    private Button button5;
    private Button button3;
    private Button button6;
    private Button button4;
    private RadioButton radiobutton1;
    private RadioButton radiobutton2;
    private RadioButton radiobutton3;
    private RadioButton radiobutton4;

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private int amount;
    private double price;
    private double taxrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprocess1();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    editText4.setText(String.valueOf(price+taxrate));
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensms();
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencal();
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencalling();
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmail();
            }
        });

        radiobutton1 = (RadioButton) findViewById(R.id.radiobutton1);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("25000 $");
                price=25000;
                amount = Integer.parseInt(editText2.getText().toString());
                taxrate=(15*25000*amount)/100;
                editText3.setText((15*25000*amount)/100);
            }
        });
        radiobutton2 = (RadioButton) findViewById(R.id.radiobutton2);
        radiobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("10000 $");
                price=10000;
                amount = Integer.parseInt(editText2.getText().toString());
                taxrate=(15*10000*amount)/100;
                editText3.setText((15*10000*amount)/100);
            }
        });
        radiobutton3 = (RadioButton) findViewById(R.id.radiobutton3);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("9.5 Million $");
                price=9500000;
                amount = Integer.parseInt(editText2.getText().toString());
                taxrate=(15*9500000*amount)/100;
                editText3.setText((15*9500000*amount)/100);
            }
        });
        radiobutton4 = (RadioButton) findViewById(R.id.radiobutton4);
        radiobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("145500 $");
                price=145500;
                amount = Integer.parseInt(editText2.getText().toString());
                taxrate = (15*145500*amount)/100;
                editText3.setText((15*145500*amount)/100);
            }
        });
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
    }
    public void openprocess1(){
        Intent intent1 = new Intent(this,SecondActivity.class);
        startActivity(intent1);
    }
    public void opensms(){
        Intent intent2= new Intent(this, sms.class);
        startActivity(intent2);
    }
    public void opencal(){
        Intent intent3= new Intent(this, calculator.class);
        startActivity(intent3);
    }
    public void opencalling(){
        Intent intent4= new Intent(this, calling.class);
        startActivity(intent4);
    }
    public void openmail(){
        Intent intent5= new Intent(this, email.class);
        startActivity(intent5);
    }

}

