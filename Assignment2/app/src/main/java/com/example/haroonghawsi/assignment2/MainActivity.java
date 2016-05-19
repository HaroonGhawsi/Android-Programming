package com.example.haroonghawsi.assignment2;
//package com.example.eventhandlers;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;

public class MainActivity extends Activity {
    String tag="EVH_Demo: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, tag + "onCreate()");
    }
    protected void onStart() {
        super.onStart();
        Log.d(tag, tag + "onStart()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(tag, tag + "onReStart()");
    }
    protected void onResume() {
        super.onResume();
        Log.d(tag, tag + "onResume()");
    }
    protected void onPause() {
        super.onPause();
        Log.d(tag, tag + "onPause()");
    }
    protected void onStop() {
        super.onStop();

        Log.d(tag, tag + "onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();

        Log.d(tag, tag + "onDestroy()");
    }
}