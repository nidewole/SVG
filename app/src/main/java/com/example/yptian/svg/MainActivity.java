package com.example.yptian.svg;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout activityMain;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface fromAsset = Typeface.createFromAsset(getAssets(), "iconfont.ttf");


        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);


        tv1.setTypeface(fromAsset);
        tv2.setTypeface(fromAsset);
        tv3.setTypeface(fromAsset);
        tv4.setTypeface(fromAsset);
        tv5.setTypeface(fromAsset);
        tv6.setTypeface(fromAsset);
    }
}
