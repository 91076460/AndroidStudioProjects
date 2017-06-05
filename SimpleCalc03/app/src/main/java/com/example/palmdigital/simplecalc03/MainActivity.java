package com.example.palmdigital.simplecalc03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   //fields
    ImageView imageViewT1;
    ImageView imageViewT2;
    ImageView imageViewT3;
    ImageView imageViewT4;
    ImageView imageViewT5;
    ImageView imageViewT6;
    ImageView imageViewT7;
    ImageView imageViewT8;
    ImageView imageViewT9;
    ImageView imageViewM1;
    ImageView imageViewM2;
    ImageView imageViewM3;
    ImageView imageViewM4;
    ImageView imageViewM5;
    ImageView imageViewM6;
    ImageView imageViewM7;
    ImageView imageViewM8;
    ImageView imageViewM9;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageViewEquals;
    ImageView imageViewMultiply;
    ImageView imageViewDivide;


    int num1;
    int num2;
    int operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //top numbers
        imageViewT1 = (ImageView) findViewById(R.id.imageView);
        imageViewT2 = (ImageView) findViewById(R.id.imageView2);
        imageViewT3 = (ImageView) findViewById(R.id.imageView3);
        imageViewT4 = (ImageView) findViewById(R.id.imageView4);
        imageViewT5 = (ImageView) findViewById(R.id.imageView5);
        imageViewT6 = (ImageView) findViewById(R.id.imageView5);
        imageViewT7 = (ImageView) findViewById(R.id.imageView7);
        imageViewT8 = (ImageView) findViewById(R.id.imageView8);
        imageViewT9 = (ImageView) findViewById(R.id.imageView9);
       //middle numbers
        imageViewM1 = (ImageView) findViewById(R.id.imageView12);
        imageViewM2 = (ImageView) findViewById(R.id.imageView13);
        imageViewM3 = (ImageView) findViewById(R.id.imageView14);
        imageViewM4 = (ImageView) findViewById(R.id.imageView15);
        imageViewM5 = (ImageView) findViewById(R.id.imageView16);
        imageViewM6 = (ImageView) findViewById(R.id.imageView17);
        imageViewM7 = (ImageView) findViewById(R.id.imageView18);
        imageViewM8 = (ImageView) findViewById(R.id.imageView19);
        imageViewM9 = (ImageView) findViewById(R.id.imageView20);
        //operators
        imageViewEquals = (ImageView) findViewById(R.id.imageViewEquals);
        imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
        imageViewMinus = (ImageView) findViewById(R.id.imageViewMinus);
        imageViewDivide = (ImageView) findViewById(R.id.imageViewDivide);








    }



    public void onClick(View view)
    {

    }
}
