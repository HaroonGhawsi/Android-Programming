package com.example.haroonghawsi.assignment72;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Hashtable;

public class LoginpageActivity extends AppCompatActivity {

    EditText uName;
    EditText uPassword;
    Button loginButton;
    String data = "";
    Hashtable<String, String> users=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        uName = (EditText) findViewById(R.id.edit_userName);
        uPassword = (EditText) findViewById(R.id.edit_userPassword);

        users = new Hashtable<String, String>();
        users.put("admin", "pass");
        users.put("user", "123");

        loginButton = (Button) findViewById(R.id.btn_usrPassLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(getBaseContext(), MainActivity.class);
                startActivity(data);

                if (users.get(uName.getText().toString()).equals(uPassword.getText().toString())) {
                    data.setData(Uri.parse(uName.getText().toString()));
                    setResult(RESULT_OK, data);

                } else {

                    data.setData(Uri.parse(""));
                    setResult(RESULT_CANCELED, data);
                }
                finish();
            }});

    }
}
