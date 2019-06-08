package com.sneha.smartagro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GovWebsite extends AppCompatActivity {

    public WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov_website);

        String url;
        int num=(int)getIntent().getIntExtra("number",1);
        if(num==1){
            url = "http://agricoop.nic.in/#";
        }else if(num==2){
            url = "http://agriculture.gov.in/";
        }else if(num==3){
            url = "http://agmarknet.gov.in/";
        }else if(num==4){
            url = "https://farmer.gov.in/";
        }else if(num==5){
            url = "https://docs.google.com/document/d/1bIbNcgxEwNzAxmRG22WTLSQXZCZElw0z8QMdIOfZzsc/edit?usp=sharing";
        }else{
            url = "http://agriculture.gov.in/";
        }

        mWebView = (WebView) findViewById(R.id.webwv);

        // Enable Javascript
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setBuiltInZoomControls(true);

        mWebView.loadUrl(url);






    }
}

