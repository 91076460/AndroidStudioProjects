package com.example.palmdigital.putextra_intents01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;
    String story;


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
                story = null;
            }
            else
            {
                story = extras.getString("story so far");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("story so far");
        }





    }
    public void next02(View view)
    {
        EditText et_noun = (EditText) findViewById(R.id.edit_text_noun1);
        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);
        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun2);

        String str_noun = et_noun.getText().toString();
        String str_adj02 = et_adj02.getText().toString();
        String str_noun2 = et_noun2.getText().toString();

        story += "To make a pizza you need to take a lump of " + str_noun
            + ", " + "and make a thin, round " + str_adj02 + " " + str_noun2 + ". ";





        Intent i = new Intent(this,Main3Activity.class );
        i.putExtra("story so far 2", story);

        startActivity(i);
    }

}
