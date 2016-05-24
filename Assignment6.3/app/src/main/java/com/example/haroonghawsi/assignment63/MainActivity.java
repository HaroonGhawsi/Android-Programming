package com.example.haroonghawsi.assignment63;

import android.provider.Browser;
import android.support.v4.media.MediaBrowserServiceCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText url;

    private WebView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btn_enterKey);
        url = (EditText) findViewById(R.id.edit_url);

        v1 = (WebView) findViewById(R.id.webView);
        v1.setWebViewClient(new MyBrowser());

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUrl = url.getText().toString();

                v1.getSettings().setLoadsImagesAutomatically(true);
                v1.getSettings().setJavaScriptEnabled(true);
                v1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                v1.loadUrl(sUrl);
            }
        });
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }

}
