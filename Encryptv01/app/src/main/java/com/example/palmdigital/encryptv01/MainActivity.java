package com.example.palmdigital.encryptv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int shift;
    int shift2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encrypt(View view) {
        EditText et_input = (EditText) findViewById(R.id.edit_text_input);
        String str_input = et_input.getText().toString();
        EditText et_shift = (EditText) findViewById(R.id.edit_text_shift);
        String str_shift = et_shift.getText().toString();
        TextView tv_output = (TextView) findViewById(R.id.text_view_output);
        if (str_shift.isEmpty())
        {
            shift = 0;
            Toast.makeText(this,"Please enter a shift",Toast.LENGTH_SHORT).show();

        }
        else
        {
            shift = Integer.parseInt(str_shift);
        }
        String str_output = tv_output.getText().toString();
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';

        int fixedCharIndex;
        int shiftCharIndex;
        String toUpperCase = str_input.toUpperCase();
        for (int i = 0; i < str_input.length(); i++) {
        }
        for (int i = 0; i < alphabet.length; i++) {
        }
        for (int i = 0; i < str_input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++)
                if (toUpperCase.charAt(i) == alphabet[j]) {
                    if (str_input.charAt(i) == alphabet[j]) {
                        shiftCharIndex = j + shift;
                        fixedCharIndex = shiftCharIndex % 26;
                        str_output = str_output + alphabet[fixedCharIndex];
                    }
                    {
                    }

                }
            if (str_input.charAt(i) == ' ') {
                str_output += " ";
            }
        }
        tv_output.setText(str_output);


    }

    public void decrypt(View view) {
        int size = 26;
        char[] alphabet2 = new char[size];
        alphabet2[0] = 'A';
        alphabet2[1] = 'B';
        alphabet2[2] = 'C';
        alphabet2[3] = 'D';
        alphabet2[4] = 'E';
        alphabet2[5] = 'F';
        alphabet2[6] = 'G';
        alphabet2[7] = 'H';
        alphabet2[8] = 'I';
        alphabet2[9] = 'J';
        alphabet2[10] = 'K';
        alphabet2[11] = 'L';
        alphabet2[12] = 'M';
        alphabet2[13] = 'N';
        alphabet2[14] = 'O';
        alphabet2[15] = 'P';
        alphabet2[16] = 'Q';
        alphabet2[17] = 'R';
        alphabet2[18] = 'S';
        alphabet2[19] = 'T';
        alphabet2[20] = 'U';
        alphabet2[21] = 'V';
        alphabet2[22] = 'W';
        alphabet2[23] = 'X';
        alphabet2[24] = 'Y';
        alphabet2[25] = 'Z';


        TextView tv_output2 = (TextView) findViewById(R.id.text_view_output2);
        EditText et_input2 = (EditText) findViewById(R.id.edit_text_input2);
        EditText et_shift2 = (EditText) findViewById(R.id.edit_text_shift2);
        String str_input2 = et_input2.getText().toString();
        String str_shift2 = et_shift2.getText().toString();
        if (str_shift2.isEmpty())
        {
            shift2 = 0;
            Toast.makeText(this,"Please enter a shift",Toast.LENGTH_SHORT).show();
        }
        else
        {
            shift2 = Integer.parseInt(str_shift2);
        }
        String str_output2 = tv_output2.getText().toString();
        int fixedCharIndex;
        int shiftCharIndex;
        String toUpperCase = str_input2.toUpperCase();

        for (int i = 0; i < str_input2.length(); i++) {
        }
        System.out.println();
        for (int i = 0; i < alphabet2.length; i++) {
        }
        for (int i = 0; i < str_input2.length(); i++) {
            for (int j = 0; j < alphabet2.length; j++)
                if (toUpperCase.charAt(i) == alphabet2[j]) {

                    if (str_input2.charAt(i) == alphabet2[j]) {
                        shiftCharIndex = j - shift2;
                        fixedCharIndex = shiftCharIndex % 26;
                        str_output2 = str_output2 + alphabet2[fixedCharIndex];
                    }


                }
            if (str_input2.charAt(i) == ' ') {
                str_output2 += " ";
            }
            tv_output2.setText(str_output2);

        }
    }
}