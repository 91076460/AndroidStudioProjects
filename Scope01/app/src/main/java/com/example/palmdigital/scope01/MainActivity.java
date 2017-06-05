package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//We are outside MainActivity class
//We are outside any methods


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // here we are inside the onCreate() method
    // the MainActivity class


    // when we 'declare' or 'define' a variable we use the following format:
    // dataType variableName;
    // some example:
    int myInt; //this is declaring a variable of dataType int and named myInt
    double myDouble; //this is declaring a variable of dataType Double and named myDouble
    TextView textView_Story; //this is declaring a variable of dataType TextView and named textView_Story

    ImageView imageView_ex; //this is declaring a variable of dataType ImageView and named imageView_ex

    //assigning a value to a declared variable
    //after we declare a variabe we can assign a value
    //variablName = some value of the same data type
    myInt = 10;

}
