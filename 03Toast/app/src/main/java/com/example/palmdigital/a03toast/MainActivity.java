package com.example.palmdigital.a03toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "My name is Brandon",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "My favorite holiday is Thanksgiving",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "My favorite food is ham",
                Toast.LENGTH_LONG).show();
    }
}
