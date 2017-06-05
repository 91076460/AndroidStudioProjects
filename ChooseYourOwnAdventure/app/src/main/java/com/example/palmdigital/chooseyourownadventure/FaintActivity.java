package com.example.palmdigital.chooseyourownadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FaintActivity extends AppCompatActivity implements View.OnClickListener {
    // fields
    Button Button_Left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        //references

        //TextView refs
        TextView textView_story = (TextView) findViewById(R.id.textView_Story);


        //Buttons
        Button_Left = (Button) findViewById(R.id.Button_Left);

        // set text
        // TextViews
        textView_story.setText("You made a delicious soup! Yum! The end.");



        // Buttons
        Button_Left.setText("Start Over");


        Button_Left.setOnClickListener(this);



    }// end onCreate

    public void onClick(View view)
    {
        if (view.getId() == R.id.Button_Left)
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }

    }
}//end of class MainActivity

