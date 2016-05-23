package com.example.haroon.assignment5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    float yValue = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        /*
        viewLayoutParams.leftMargin=40;
        viewLayoutParams.rightMargin=40;
        viewLayoutParams.topMargin=10;
        viewLayoutParams.bottomMargin=10;
        */


        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        final Button b1 = new Button(this);
        final Button b2 = new Button(this);
        b1.setText("First Button");
        b1.setLayoutParams(lParams);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getVisibility() == View.VISIBLE){
                    b2.setVisibility(View.INVISIBLE);
                }else{
                    b2.setVisibility(View.VISIBLE);
                }
            }
        });
        layout.addView(b1);

        b2.setText("Second Button");
        b2.setLayoutParams(lParams);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yValue = yValue+60;

                b1.animate().x(10f).y(yValue);
            }
        });
        layout.addView(b2);

        LinearLayout.LayoutParams layoutp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        this.addContentView(layout, layoutp);
    };

};
