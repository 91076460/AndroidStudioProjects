package com.example.palmdigital.intent_putextra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String newStory;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newStory = null;
            }
            else
            {
                 newStory = extras.getString("story so far1");
            }
        }
        else
        {

        }



    }
    public void next02(View view)
    {
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);
        tv_story.setText(newStory);
    }
}
