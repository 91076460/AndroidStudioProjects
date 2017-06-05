package com.example.palmdigital.chooseyourownadventure01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //references

        //TextView
        TextView textView_Story    = (TextView) findViewById(R.id.textView_Story);
        TextView textView_Question = (TextView) findViewById(R.id.textView_Question);

        textView_Story.setText("One morning a tortoise woke up from a dream");
        textView_Question.setText("Do you want to explore the dream or wake up");
    }
}
