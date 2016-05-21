package com.example.haroonghawsi.assignment5;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button firstButton = new Button(this);
    firstButton.setText("First");
    firstButton.setLayoutParams(viewLayoutParams);
    firstButton.setOnClickListener(firstButtonClickListener);
    linearLayout.addView(firstButton);

    Button secondButton = new Button(this);
    secondButton.setText("Second");
    secondButton.setLayoutParams(viewLayoutParams);
    secondButton.setOnClickListener(secondButtonClickListener);
    linearLayout.addView(secondButton);

    LinearLayoutCompat.LayoutParams

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

         viewLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

    }


}
