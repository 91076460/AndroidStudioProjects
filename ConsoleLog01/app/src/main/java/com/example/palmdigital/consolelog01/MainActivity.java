package com.example.palmdigital.consolelog01;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myInt = 4;
        double myDouble = 4.5;
        float myfloat = 4.4f;
        String myString = "Hey i am a string";
        System.out.println(4);
        System.out.println(4);
        Log.i("info", "myInt = " + myInt);
        Log.i("info", "myDouble = " + myDouble);
        Log.i("info", "myFloat = " + myfloat);
        Log.i("info", "myString = " + myString);


        if (myInt == 10) {
            Log.i("info", "the test is true");
        } else {
            Log.i("info", "the test is false");
        }
        if (myDouble == 4.5) {
            Log.i("info", "the test is true");
        } else
        {
            Log.i("info", "the test is false");
        }
        myInt = changValue();

        Log.i("info")
    }

    public int changValue()
    {
        return 400;
    }
}
