package com.example.palmdigital.button02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("THE BLUE PILL");
        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setText("THE RED PILL");



        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);

    buttonObject01.setBackgroundColor(0xff0000ff);
        buttonObject02.setBackgroundColor(0xffff0000);
    }


    public void onClick (View view)
    {
        Log.i("info" , "You chose the blue pill");
        Toast.makeText(MainActivity.this, "You Chose The Blue Pill",
                Toast.LENGTH_SHORT).show();
    }


}
