package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.*;

public class FirstActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }

    public void handleBtnOk(View v) {

        EditText textView1 = findViewById(R.id.inputNum1);
        EditText textView2 = findViewById(R.id.inputNum2);

        String inputNum1 = textView1.getText().toString();
        String inputNum2 = textView2.getText().toString();

        Log.d("inputInfo", inputNum1);
        Log.d("input2info", inputNum2);

        Bundle bundle = new Bundle();
        bundle.putString("inputNum1", inputNum1);
        bundle.putString("inputNum2", inputNum2);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);

        startActivity(intent);

        Context context = getApplicationContext();
        //The context to use.Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = LENGTH_SHORT;
        //How long the toast message will lasts
        Toast toast = makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 800, 1000);



    }


}