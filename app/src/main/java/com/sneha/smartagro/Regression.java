package com.sneha.smartagro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Regression extends AppCompatActivity {

    public WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regression);

        mWebView = (WebView) findViewById(R.id.webwv);

        // Enable Javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDomStorageEnabled(true);

        mWebView.loadUrl("https://colab.research.google.com/drive/151V8rejpv4bzZ1a11E_4u3-zYtXAGqFX");

    }
}
