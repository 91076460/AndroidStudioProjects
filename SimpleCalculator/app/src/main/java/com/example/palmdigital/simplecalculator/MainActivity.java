package com.example.palmdigital.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewDisplayTop;
    TextView textViewDisplayCenter;
    TextView textViewDisplayBottom;
    int num1 = R.id.textView;
    int num2 = R.id.textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewEquals = (ImageView) findViewById(R.id.imageViewEquals);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayCenter = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayCenter.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewDisplayCenter.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textViewDisplayCenter.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageViewEquals)

        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText( "" + sum);
        }

    }


    }

