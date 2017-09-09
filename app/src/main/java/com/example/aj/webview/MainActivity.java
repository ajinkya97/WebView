package com.example.aj.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wb=(WebView)findViewById(R.id.mywebview);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl("http://www.google.com");
    }
}
