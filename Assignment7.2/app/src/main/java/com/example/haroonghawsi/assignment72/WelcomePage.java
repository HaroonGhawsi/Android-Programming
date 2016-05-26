package com.example.haroonghawsi.assignment72;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class WelcomePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Button _login;
        _login = (Button) findViewById(R.id.btn_login);
        _login.setOnClickListener(login_ClickListener);


    }

    private View.OnClickListener login_ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(), LoginpageActivity.class);
            startActivity(intent);
        }
    };
    /*private void startActivity(View view){
        Intent intent = new Intent(getBaseContext(), LoginpageActivity.class);
        startActivity(intent);
    }*/

}
