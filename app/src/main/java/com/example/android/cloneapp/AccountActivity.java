package com.example.android.cloneapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.cloneapp.navigation.BottomNavigatorSetup;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavSetup();

    }
    private void bottomNavSetup(){
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.my_nav);
        BottomNavigatorSetup.bottomNavigationSetupDone(bottomNavigationViewEx);
        BottomNavigatorSetup.enableBottomNavigation(AccountActivity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);
    }
}