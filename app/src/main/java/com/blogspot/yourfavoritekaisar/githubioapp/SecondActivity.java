package com.blogspot.yourfavoritekaisar.githubioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://github.com/YoungProgrammerTerlaluManis");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
