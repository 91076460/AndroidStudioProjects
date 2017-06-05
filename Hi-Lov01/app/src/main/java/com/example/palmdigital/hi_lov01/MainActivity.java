package com.example.palmdigital.hi_lov01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void CheckGuess(View view)
    {
        EditText et_guess = (EditText) findViewById(R.id.edit_text_guess);
        String str_guess = et_guess.getText().toString();
        TextView tv_output = (TextView) findViewById(R.id.text_view_output) ;
        String str_output = tv_output.getText().toString();
        Random rand = new Random();
        int answer = rand.nextInt(1) + 1;
        for (int i = 0; i < 8; i++)
        {
            if (R.id.edit_text_guess == answer)
            {
                tv_output.setText("You have won the game");
            }
            else if (R.id.edit_text_guess > answer)
            {
                tv_output.setText("Too high");
            }
            else if (R.id.edit_text_guess < answer)
            {
                tv_output.setText("Too low");
            }
        }
    }
    public void restart(View view)
    {
        onRestart();
    }
}