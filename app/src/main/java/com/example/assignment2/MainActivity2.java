package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView result1;
    EditText num1,num2;
    Button add,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result1 = findViewById(R.id.result1);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        configureclick1();
    }
    public void addNumber(View v){

        double n1,n2,Result;

        n1= Double.parseDouble(num1.getText().toString());
        n2= Double.parseDouble(num2.getText().toString());
        Result=n1+n2;

        result1.setText(String.valueOf(Result));
    }
    public void subNumber(View v){

        double n1,n2,Result;
        n1= Double.parseDouble(num1.getText().toString());
        n2= Double.parseDouble(num2.getText().toString());
        Result=n1-n2;

        result1.setText(String.valueOf(Result));
    }
    private void configureclick1() {
        Button click1 = findViewById(R.id.click1);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}