package com.example.palmdigital.chooseyourownadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // fields
    Button Button_Left;
    Button Button_Right;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //references

        //TextView refs
        TextView textView_story    = (TextView) findViewById(R.id.textView_Story);
        TextView textView_Question = (TextView) findViewById(R.id.textView_Question);

        //Buttons
        Button_Left = (Button) findViewById(R.id.button_Left);
        Button_Right = (Button) findViewById(R.id.button_Right);

        // set text
        // TextViews
        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_Question.setText("Do you want to 'wake up' or 'explore' the dream?");


        // Buttons
        Button_Left.setText("Wake up");
        Button_Right.setText("Explore");

        Button_Left.setOnClickListener(this);
        Button_Right.setOnClickListener(this);


    }// end onCreate
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_Left)
        {
            Intent i = new Intent(this,WakeUpActivity.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.button_Right)
        {
            Intent i = new Intent(this,ExploreActivity.class);
            startActivity(i);
        }
    }
}//end of class MainActivity
