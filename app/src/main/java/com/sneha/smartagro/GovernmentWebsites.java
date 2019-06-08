package com.sneha.smartagro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;



public class GovernmentWebsites extends AppCompatActivity {

    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_websites);

    }

    public void onAgricoop(View view){

        Intent intent= new Intent(getApplicationContext(),GovWebsite.class);
        intent.putExtra("number",1);
        startActivity(intent);
    }

    public void onAgriculture(View view) {

        Intent intent= new Intent(getApplicationContext(),GovWebsite.class);
        intent.putExtra("number",2);
        startActivity(intent);

    }

    public void onAgmarknet(View view){

        Intent intent= new Intent(getApplicationContext(),GovWebsite.class);
        intent.putExtra("number",3);
        startActivity(intent);
    }

    public void onFarmer(View view) {

        Intent intent= new Intent(getApplicationContext(),GovWebsite.class);
        intent.putExtra("number",4);
        startActivity(intent);
    }

    public void onState(View view){

        Intent intent= new Intent(getApplicationContext(),GovWebsite.class);
        intent.putExtra("number",5);
        startActivity(intent);

    }

}
