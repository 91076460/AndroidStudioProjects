package com.example.palmdigital.textviewoutput1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //fields
    TextView textViewDisplayTop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

         textViewDisplayTop = (TextView) findViewById(R.id.textView);

        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView2)
        {
        textViewDisplayTop.setText("1");
        }
        else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("2");
        }
        else if (view.getId() == R.id.imageView4)
        {
            textViewDisplayTop.setText("3");
        }
    }
}
