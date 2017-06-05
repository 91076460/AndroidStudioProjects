package com.example.palmdigital.simplecalc02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textViewDisplayTop;
    TextView textViewDisplayCenter;
    TextView textViewDisplayBottom;
    int num1;
    int num2;
    int result;
    int operator;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    int op;

    ImageView imageView2;
    ImageView imageView3;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageViewEquals = (ImageView) findViewById(R.id.imageViewEquals);
        imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
         imageViewMinus = (ImageView) findViewById(R.id.imageViewMinus);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);


        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayCenter = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView18.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView20.setOnClickListener(this);
        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);








    }

    public void onClick(View view)
    {
       if (view.getId() == R.id.imageView)
      {
        textViewDisplayTop.setText("1");
          num1 = 1;
      }

       else if (view.getId() == R.id.imageView2)
    {
        textViewDisplayTop.setText("2");
        num1 = 2;
    }
       else if (view.getId() == R.id.imageView3)
       {
           textViewDisplayTop.setText("3");
           num1 = 3;
       }
       else if (view.getId() == R.id.imageView4)
       {
           textViewDisplayTop.setText("4");
           num1 = 4;
       }
       else if (view.getId() == R.id.imageView5)
       {
           textViewDisplayTop.setText("5");
           num1 = 5;
       }
       else if (view.getId() == R.id.imageView6)
       {
           textViewDisplayTop.setText("6");
           num1 = 6;
       }
       else if (view.getId() == R.id.imageView7)
       {
           textViewDisplayTop.setText("7");
           num1 = 7;
       }
       else if (view.getId() == R.id.imageView8)
       {
           textViewDisplayTop.setText("8");
           num1 = 8;
       }
       else if (view.getId() == R.id.imageView9)
       {
           textViewDisplayTop.setText("9");
           num1 = 9;
       }
       else if (view.getId() == R.id.imageView12)
       {
           textViewDisplayCenter.setText("1");
           num2 = 1;
       }
       else if (view.getId() == R.id.imageView13)
       {
           textViewDisplayCenter.setText("2");
           num2 = 2;
       }
       else if (view.getId() == R.id.imageView14)
       {
           textViewDisplayCenter.setText("3");
           num2 = 3;
       }
       else if (view.getId() == R.id.imageView15)
       {
           textViewDisplayCenter.setText("4");
           num2 = 4;
       }
       else if (view.getId() == R.id.imageView16)
       {
           textViewDisplayCenter.setText("5");
           num2 = 5;
       }
       else if (view.getId() == R.id.imageView17)
       {
           textViewDisplayCenter.setText("6");
           num2 = 6;
       }
       else if (view.getId() == R.id.imageView18)
       {
           textViewDisplayCenter.setText("7");
           num2 = 7;
       }
       else if (view.getId() == R.id.imageView19)
       {
           textViewDisplayCenter.setText("8");
           num2 = 8;
       }
       else if (view.getId() == R.id.imageView20)
       {
           textViewDisplayCenter.setText("9");
           num2 = 9;
       }
        else if (view.getId() == R.id.imageView21)
       {
           textViewDisplayTop.setText("0");
           num1 = 0;
       }
       else if (view.getId() == R.id.imageView22)
       {
           textViewDisplayCenter.setText("0");
           num2 = 0;
       }
        else if (view.getId() == R.id.imageViewMinus)
       {
           operator = 2;
           color(2);
       }
       else if (view.getId() == R.id.imageViewPlus)
       {
           operator = 1;
           color(1);
       }
       else if (view.getId() == R.id.imageViewEquals) {
           if (operator == 1)
           {
               result = num1 + num2;
               textViewDisplayBottom.setText("" + result);
           }
           if (operator == 2)
           {
               result = num1 - num2;
               textViewDisplayBottom.setText("" + result);

           }

       }

}

    public void color(int op)
    {
        if (op == 1)
        {
            imageViewPlus.setBackgroundColor(0xff0000ff);
            imageViewMinus.setBackgroundColor(0xffffffff);
        }
        else if (op == 2)
        {
            imageViewPlus.setBackgroundColor(0xffffffff);
            imageViewMinus.setBackgroundColor(0xff0000ff);
        }
    }
}

