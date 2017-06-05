package com.example.palmdigital.clickableimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonObject1 = (Button) findViewById(R.id.imageView1);
        buttonObject1.setOnClickListener(this);
    }
    public void onClick (View view){

    }
}
