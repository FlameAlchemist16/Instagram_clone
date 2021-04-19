package com.example.android.cloneapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.android.cloneapp.messages.MessengingActivity;
import com.example.android.cloneapp.navigation.BottomNavigatorSetup;
import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupPager();

        bottomNavSetup();

//        ArrayList<PostList> post = new ArrayList<>();
//        post.add(new PostList("_.dhruvg._", "Back To Campus", "Going back to campus after long time ;)","76", R.drawable.sample_post, R.drawable.pm));
//
//
//        PostAdapter postAdapter=new PostAdapter(this, post);
//        ListView listView=(ListView)findViewById(R.id.new_posts);
//        listView.setAdapter(postAdapter);
    }

    private void setupPager(){
        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager());
        homePagerAdapter.addFragment(new homeFragment());
        homePagerAdapter.addFragment(new messageFragment());

        ViewPager viewPager = (ViewPager) findViewById(R.id.new_posts);
        viewPager.setAdapter(homePagerAdapter);

//        TabLayout tabLayout = (TabLayout) findViewById(R.id.my_toolbar);
//        tabLayout.setupWithViewPager(viewPager, false);
//
//        tabLayout.getTabAt(0).setCustomView(R.layout.home_button);
//        tabLayout.getTabAt(1).setCustomView(R.layout.message_button);

    }
    private void bottomNavSetup(){
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.my_nav);
        BottomNavigatorSetup.bottomNavigationSetupDone(bottomNavigationViewEx);
        BottomNavigatorSetup.enableBottomNavigation(MainActivity.this, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
    }
    public void openMessages(View view){
        Intent intent = new Intent(MainActivity.this, MessengingActivity.class);
        startActivity(intent);
    }

}