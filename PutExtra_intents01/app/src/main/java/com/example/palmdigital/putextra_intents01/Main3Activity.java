package com.example.palmdigital.putextra_intents01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                story = null;
            }
            else
            {
                story = extras.getString("story so far 2");
            }
        }
        else
        {
            story = (String) savedInstanceState.getSerializable("story so far 2");
        }

    }


    public void next03(View view)
    {
        EditText et_adj03 = (EditText) findViewById(R.id.edit_text_adj03);
        EditText et_noun3 = (EditText) findViewById(R.id.edit_text_noun3);
        EditText et_pnoun = (EditText) findViewById(R.id.edit_text_pnoun);

        String str_adj03 = et_adj03.getText().toString();
        String str_noun3 = et_noun3.getText().toString();
        String str_pnoun = et_pnoun.getText().toString();

        story += "Then cover it with" + str_adj03 + " sauce, " + str_noun3;
        story += " cheese, and fresh chopped " + str_pnoun;

        Intent i = new Intent(this,Main4Activity.class );
        i.putExtra("story so far 3", story);

        startActivity(i);
    }
}
