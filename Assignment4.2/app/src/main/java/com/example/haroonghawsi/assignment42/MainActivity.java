package com.example.haroonghawsi.assignment42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int commentCount = 0;
        Button _submit = (Button) findViewById(R.id.btn_submit);
        _submit.setOnClickListener(__submit);
    }
    private View.OnClickListener __submit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText userName = (EditText) findViewById(R.id.eName);
            EditText userComment = (EditText) findViewById(R.id.eComment);

            Button __submit = (Button) v;

            if(userName.getText().toString().length() == 0){

                userName.setError("User Name is required!");
            }
            else if(userComment.getText().toString().length() == 0){

                userComment.setError("Comment is required!");
            }
        }
    };
}


