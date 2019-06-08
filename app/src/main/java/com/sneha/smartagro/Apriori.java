package com.sneha.smartagro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Apriori extends AppCompatActivity {
    public WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apriori);

        mWebView = (WebView) findViewById(R.id.webwv);

        // Enable Javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDomStorageEnabled(true);

        mWebView.loadUrl("https://colab.research.google.com/drive/16QrhZrghPlHTKe1B4vkmHBOq-cvIX158");


    }
}