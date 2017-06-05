package com.example.palmdigital.madlibpizza_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory(View view)
    {
        //get all references
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        EditText et_nationality = (EditText) findViewById(R.id.edit_text_nation);

        EditText et_name = (EditText) findViewById(R.id.edit_text_name);

        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);

        EditText et_adj02 = (EditText) findViewById(R.id.edit_text_adj02);

        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun2);

        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);

        EditText et_adj04 = (EditText) findViewById(R.id.edit_text_adj04);

        //Strings
        String story = "Pizza was invented by a ";
        String str_adj01 = et_adj01.getText().toString();
        String str_nationality = et_nationality.getText().toString();
        String str_name = et_name.getText().toString();
        String str_noun1 = et_noun1.getText().toString();
        String str_adj02 = et_adj02.getText().toString();
        String str_noun2 = et_noun2.getText().toString();
        String str_adj03 = et_adj03.getText().toString();
        String str_adj04 = et_adj04.getText().toString();


        story = story + str_adj01 + " " + str_nationality + " " + "chef named"
                + " ";
        story += str_name + ". To make a pizza, you need to take a lump of " + str_noun1;
        story += " and a thin, round " + str_adj02 + " " + str_noun2;
        story += ". Then cover it with " + str_adj03 + " sauce, ";
        story += str_adj04 + " " + "cheese.";


        tv_story.setText(story);
    }
}
