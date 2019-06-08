package com.sneha.smartagro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Analysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        
    }

    public void getApriori(View view){

        Intent intent= new Intent(getApplicationContext(),Apriori.class);
        startActivity(intent);
    }

    public void getRegression(View view) {

        Intent intent= new Intent(getApplicationContext(),Regression.class);
        startActivity(intent);
    }
}
