package com.example.haroonghawsi.assignment4;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assignment 4.1 Starts here..

        Button _showBtn = (Button) findViewById(R.id.btn_show);
        _showBtn.setOnClickListener(myButtonListener);

        Button _resetBtn = (Button) findViewById(R.id.btn_reset);
        _resetBtn.setOnClickListener(headphoneX100);
    }

    private View.OnClickListener myButtonListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd mm yyyy HH:mm:ss");
            String currentDt = sdf.format(Calendar.getInstance().getTime());

            Button _showBtn = (Button) v;
                TextView instant_text = (TextView) findViewById(R.id.et_comment);
                instant_text.setText(currentDt);
        }
    };

    private View.OnClickListener headphoneX100 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button _resetBtn = (Button) v;

            EditText et = (EditText) findViewById(R.id.et_comment);
            et.setText("");
        }
    };
    //Assignment 4.1 ends here..
}

