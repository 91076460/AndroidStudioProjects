package com.example.palmdigital.chooseyourownadventurev2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView_Story;
    TextView textView_Question;
    Button buttonRight;
    Button buttonLeft;
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Story    = (TextView) findViewById(R.id.textView_Story);
        textView_Question = (TextView) findViewById(R.id.textView_Question);

        buttonLeft  = (Button) findViewById(R.id.buttonLeft);
        buttonRight = (Button) findViewById(R.id.buttonRight);
        buttonRight.setOnClickListener(this);
        buttonLeft .setOnClickListener(this);
        buttonLeft.setText("Wake up");
        buttonRight.setText("Explore");


        textView_Story.setText("One morning a tortoise woke up from a dream");
        textView_Question.setText("Do you want to explore the dream or wake up");
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonRight)
        {
            explore();
        }
        else if (view.getId() == R.id.buttonLeft)
        {
            wakeUp();
        }
    }
    public void wakeUp()
    {
        textView_Story.setText("You wake up and have a boring day");
        op = 1;
    }
    public void explore()
    {
        textView_Story.setText("You approach a glowing, green bucket of ooze. Worried" +
                "that you will get in trouble, you pick up the bucket.");
        textView_Question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        buttonLeft.setText("backyard");
        buttonRight.setText("toilet");
        op = 2;
    }
}
