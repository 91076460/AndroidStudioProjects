package com.example.palmdigital.madlibsummerv02;

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
        EditText et_name = (EditText) findViewById(R.id.edit_text_name);
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

        EditText et_place1 = (EditText) findViewById(R.id.edit_text_place1);

        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);

        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_pluralnoun1);

        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);

        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_pluralnoun2);

        EditText et_place2 = (EditText) findViewById(R.id.edit_text_place2);

        EditText et_verb = (EditText) findViewById(R.id.edit_text_verb);







        //Strings
        String story = "Last summer mom and dad took me and ";
        String str_name = et_name.getText().toString();
        String str_place = et_place1.getText().toString();
        String str_adj1 = et_adj1.getText().toString();
        String str_noun1 = et_noun1.getText().toString();
        String str_adj2 = et_adj2.getText().toString();
        String str_noun2 = et_noun2.getText().toString();
        String str_place2 = et_place2.getText().toString();
        String str_verb = et_verb.getText().toString();


        story += str_name + " " + "on a trip to " + str_place;
        story += ". The weather there is very " + str_adj1;
        story += "! Northern " + str_place;


        tv_story.setText(story);
    }
}
