package com.sneha.smartagro;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_start_up);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ConnectionManager cm = new ConnectionManager(getApplicationContext());
                boolean connection = cm.isConnectingToInternet();
                if(!connection){
                    AlertDialog alertDialog = new AlertDialog.Builder(Splash.this).create();
                    alertDialog.setTitle("No Internet Connection");
                    alertDialog.setMessage("This app requires internet to run. Try again after connecting to internet");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Try Again",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    Intent i = new Intent(Splash.this, Splash.class);
                                    startActivity(i);
                                    finish();

                                }
                            });
                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Exit",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    finish();
                                }
                            });
                    alertDialog.show();
                }
                else {
                    Intent i = new Intent(Splash.this, Home1.class);
                    startActivity(i);
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);
    }

}