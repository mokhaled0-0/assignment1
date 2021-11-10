package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView result;
    EditText Num1,Num2;
    Button multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = findViewById(R.id.result);
        Num1 = findViewById(R.id.Num1);
        Num2 = findViewById(R.id.Num2);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        configureclick2();
    }
    public void mulNumber(View v){

        double n1,n2,Result;

        n1= Double.parseDouble(Num1.getText().toString());
        n2= Double.parseDouble(Num2.getText().toString());
        Result=n1*n2;

        result.setText(String.valueOf(Result));


    }
    public void divNumber(View v){

        double n1,n2,Result;

        n1= Double.parseDouble(Num1.getText().toString());
        n2= Double.parseDouble(Num2.getText().toString());
        Result=n1/n2;

        result.setText(String.valueOf(Result));

    }
    private void configureclick2() {
        Button click1 = findViewById(R.id.click1);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
}
}