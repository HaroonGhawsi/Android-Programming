package com.example.haroonghawsi.assignment3;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        SimpleDateFormat sdf = new SimpleDateFormat("dd mm yyyy HH:mm:ss");
        String currentDt = sdf.format(Calendar.getInstance().getTime());
        outState.putString("currentValue",currentDt );
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        TextView tv = (TextView) findViewById(R.id.editText_dt_comment);
        super.onRestoreInstanceState(savedInstanceState);
        String currentDt = savedInstanceState.getString("currentValue");
        tv.setText(currentDt);
    }
}
