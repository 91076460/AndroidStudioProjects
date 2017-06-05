package com.example.palmdigital.putextra_intents01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String story;
    String newstring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("story so far 3");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("story so far 3");
        }
    }
    public void viewstory(View view)
    {
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);
        tv_story.setText(story);
    }
}
