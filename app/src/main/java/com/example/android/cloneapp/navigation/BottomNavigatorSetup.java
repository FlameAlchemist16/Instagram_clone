package com.example.android.cloneapp.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.android.cloneapp.AccountActivity;
import com.example.android.cloneapp.AddActivity;
import com.example.android.cloneapp.LikeActivity;
import com.example.android.cloneapp.MainActivity;
import com.example.android.cloneapp.R;
import com.example.android.cloneapp.SearchActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigatorSetup{
    public static void bottomNavigationSetupDone(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
    public static void enableBottomNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home_page:
                        Intent intent0 = new Intent(context, MainActivity.class);
                        context.startActivity(intent0);
                        break;

                    case R.id.search_page:
                        Intent intent1 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.add_new_post:
                        Intent intent2 = new Intent(context, AddActivity.class);
                        context.startActivity(intent2);
                        break;

                    case R.id.like_page:
                        Intent intent3 = new Intent(context, LikeActivity.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.profile_page:
                        Intent intent4 = new Intent(context, AccountActivity.class);
                        context.startActivity(intent4);
                        break;
                }
                return false;
            }
        });
    }
}
