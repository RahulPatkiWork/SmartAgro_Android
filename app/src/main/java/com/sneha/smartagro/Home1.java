package com.sneha.smartagro;

//import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
//import android.app.Fragment;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.support.v7.widget.Toolbar;


public class Home1 extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private Toolbar mActionBarToolbar;
    private HomeFragment homeFragment;
    private MarketFragment marketFragment;
    private DashboardFragment DashboardFragment;
    private WebView mWebview ;
    public ColorStateList iconsColorStates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        mMainFrame = (FrameLayout) findViewById(R.id.frame_main);
        mMainNav = (BottomNavigationView) findViewById(R.id.nav_main);


        homeFragment = new HomeFragment();
        DashboardFragment = new DashboardFragment();
        marketFragment = new MarketFragment();

        setFragment(DashboardFragment);



        mMainNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                    case R.id.nav_home:
                        setFragment(homeFragment);
                       break;

                    case R.id.nav_dash:
                        setFragment(DashboardFragment);
                       // return true;
                        break;

                    case R.id.nav_market:
                        //mMainNav.setItemBackgroundResource(R.color.colorPrimaryDark);
                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(marketFragment);

                        break;
                }


                return true;
            }
                });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_main, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void onAnalysis(View view) {
        Intent intent= new Intent(getApplicationContext(),Analysis.class);
        startActivity(intent);
    }
    public void onProduction(View view) {
        Intent intent= new Intent(getApplicationContext(), Production.class);
        startActivity(intent);
    }
    public void onTreatment(View view)
    {
        Intent intent= new Intent(getApplicationContext(), Treatment.class);
        startActivity(intent);
    }

    public void onSchemes(View view)
    {
        Intent intent= new Intent(getApplicationContext(),Schemes.class);
        startActivity(intent);
    }

    public void onWebsites(View v0iew)
    {
        Intent intent= new Intent(getApplicationContext(),GovernmentWebsites.class);
        startActivity(intent);
    }



    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Home1.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }


}
