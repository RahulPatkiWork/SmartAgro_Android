package com.sneha.smartagro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Production extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);

    }

    public void getFruits(View view){

        Intent intent= new Intent(getApplicationContext(),HorticultureActivity.class);
        startActivity(intent);
    }

    public void getCrops(View view) {

        Intent intent= new Intent(getApplicationContext(), CropActivity.class);
        startActivity(intent);
    }

}
