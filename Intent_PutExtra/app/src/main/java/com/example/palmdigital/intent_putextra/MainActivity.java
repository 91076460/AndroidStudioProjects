package com.example.palmdigital.intent_putextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next01(View view)
    {
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nation =(EditText) findViewById(R.id.edit_text_nation);
        EditText et_name = (EditText) findViewById(R.id.edit_text_name);

        String str_adj = et_adj01.getText().toString();
        String str_nation = et_nation.getText().toString();
        String str_name = et_name.getText().toString();

        String story = "Pizza was invented by a " + str_adj + " " + str_nation;
        story += "chef named " + str_name + ".";

        Intent i = new Intent(this,Main2Activity.class);
        i.putExtra("story so far1", story);
        startActivity(i);



    }
}
