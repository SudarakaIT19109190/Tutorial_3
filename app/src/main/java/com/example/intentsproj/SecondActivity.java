package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText editText1,editText2;
    TextView textView;
    Button addButton, substractButton, multiplyButton ,divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1=findViewById(R.id.inputNum1);
        editText2=findViewById(R.id.inputNum2);
        textView=findViewById(R.id.txtOutput);

        addButton=findViewById(R.id.btnAddition);
        substractButton=findViewById(R.id.btnSubstraction);
        multiplyButton=findViewById(R.id.btnMultiplication);
        divideButton=findViewById(R.id.btnDivision);


        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        String number1=bundle.getString("inputNum1");
        String number2=bundle.getString("inputNum2");

        final double num1=Double.parseDouble(number1);
        final double num2=Double.parseDouble(number2);

        editText1.setText(number1);
        editText2.setText(number2);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" + "+num2+" = "+(num1+num2));
            }
        });

        substractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" - "+num2+" = "+(num1-num2));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" * "+num2+" = "+(num1*num2));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(num1+" / "+num2+" = "+(num1/num2));
            }
        });



    }
}