package com.soho.yvtc.add2numbers;

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
    public void click1(View v)
    {
        EditText ed5 = (EditText) findViewById(R.id.editText5);
        EditText ed6 = (EditText) findViewById(R.id.editText6);
        String str1 = ed5.getText().toString();
        String str2 = ed6.getText().toString();
        int q1 = Integer.valueOf(str1);
        int q2 = Integer.valueOf(str2);
        int ans = q1 + q2;
        TextView tv = (TextView) findViewById(R.id.textView6);
        tv.setText(String.valueOf(ans));


    }
}
