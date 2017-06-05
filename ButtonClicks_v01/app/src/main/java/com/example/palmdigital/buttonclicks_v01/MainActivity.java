package com.example.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button button = (Button) findViewById(R.id.button2);
    }
    public void getName(View cat)
    {
        Toast.makeText(this,"This button works",Toast.LENGTH_SHORT).show();
    }
    public void test(View dog)
    {
        Toast.makeText(this,"The test worked",Toast.LENGTH_SHORT).show();
    }
    public void random(View skittle)
    {
        Toast.makeText(this,"I am running out of ideas",Toast.LENGTH_SHORT).show();
    }
}
