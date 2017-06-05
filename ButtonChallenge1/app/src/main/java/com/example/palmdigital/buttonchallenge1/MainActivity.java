package com.example.palmdigital.buttonchallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button  buttonObject1 = (Button) findViewById(R.id.button1);
        buttonObject1.setOnClickListener(this);
        buttonObject1.setBackgroundColor(0xff0000ff);


        Button  buttonObject2 = (Button) findViewById(R.id.button2);
        buttonObject2.setOnClickListener(this);
        buttonObject2.setBackgroundColor(0xff00ff00);


        Button  buttonObject3 = (Button) findViewById(R.id.button3);
        buttonObject3.setOnClickListener(this);
        buttonObject3.setBackgroundColor(0xffff0000);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1)
        {
            Log.i("info", "You have added a new contact");
            Toast.makeText(MainActivity.this, "You have added a new contact",
                    Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button2)
        {
            Log.i("info", "You have an unread Email");
            Toast.makeText(MainActivity.this, "You have an unread Email",
                    Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button3)
        {
            Log.i("info", "You have a new message");
            Toast.makeText(MainActivity.this, "You have a new message",
                    Toast.LENGTH_SHORT) .show();

        }

        }
        }
    



