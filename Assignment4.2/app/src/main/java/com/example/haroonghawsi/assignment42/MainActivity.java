package com.example.haroonghawsi.assignment42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;







public class MainActivity extends AppCompatActivity {

    int commentCount = 0;
    String userNameInput;
    String userCommentInput;
    String commentDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        public void addComment(String name, String cMessage);
        Button _submit = (Button) findViewById(R.id.btn_submit);
        _submit.setOnClickListener(__submit);
    }
    private View.OnClickListener __submit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            EditText userName = (EditText) findViewById(R.id.eName);
            EditText userComment = (EditText) findViewById(R.id.eComment);

            Button __submit = (Button) v;

            //User input validation start here..

            int uLen = userName.getText().toString().length();
            int cLen = userComment.getText().toString().length();

            if(uLen == 0){

                userName.setError("User Name is required!");
            }
            else if(cLen == 0){

                userComment.setError("Comment is required!");
            }
            //User Input Validation ended here..
            else{

                //implement adding comment to the page.

                userNameInput = userName.getText().toString();
                userCommentInput = userComment.getText().toString();

                


            }

        }
    };

}


