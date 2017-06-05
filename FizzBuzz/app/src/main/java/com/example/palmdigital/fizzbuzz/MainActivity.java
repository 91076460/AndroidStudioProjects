package com.example.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view)
    {
        EditText et_input = (EditText) findViewById(R.id.input);
        TextView tv_output =(TextView) findViewById(R.id.ouput);
        String str_input = et_input.getText().toString();

        while (et_input == null);
        {
            tv_output.setText("Enter a number.");
        }
        int input = Integer.parseInt(str_input);

        if (input%5 == 0)
        {
            if (input%3 == 0)
            {
                tv_output.setText("Fizz Buzz");
            }
            else
            {
                tv_output.setText("Buzz");
            }

        }
        else if (input% 3 == 0)
        {
            tv_output.setText("Fizz");
        }
        else
        {
            tv_output.setText(str_input);
        }

    }
}
