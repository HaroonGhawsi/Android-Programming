package com.example.haroonghawsi.assignment52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSub = (Button) findViewById(R.id.btn_submit);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btnSub != null){
                    String[] formData = new String[]{};
                    TextView uname = (TextView) findViewById(R.id.edit_name);
                    uname.setText(uname.getText().toString());

                }
            }
        });
    }
}
