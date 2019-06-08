package com.sneha.smartagro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.sneha.smartagro.R;

public class Schemes extends AppCompatActivity {

    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

        mWebView = (WebView) findViewById(R.id.schemeswv);

        // Enable Javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setBuiltInZoomControls(true);

        mWebView.loadUrl("https://docs.google.com/document/d/122RWIq2PqPAuz0FuVlsQS9qYiZtvYXGxod593AkhzIg/edit?ts=5caa40db");

        //mWebView.loadUrl("https://archive.india.gov.in/citizen/agriculture/agri_cont_schemes.php");

    }
}