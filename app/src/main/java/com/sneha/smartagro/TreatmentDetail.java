package com.sneha.smartagro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class TreatmentDetail extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.treatment_detail);

        int image=(Integer) getIntent().getIntExtra("image",R.drawable.t1);
        int text=(Integer)getIntent().getIntExtra("info",0);

        Log.v("###",text+"");

        imageView=(ImageView)findViewById(R.id.imageView);
        textView=(TextView)findViewById(R.id.detail);

        imageView.setImageResource(image);
        textView.setText(text);
    }
}
