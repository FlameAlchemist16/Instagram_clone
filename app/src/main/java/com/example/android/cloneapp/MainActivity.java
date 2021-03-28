package com.example.android.cloneapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        ImageButton ig = (ImageButton) findViewById(R.id.messenger);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessengingActivity.class);
                startActivity(intent);
            }
        });

        ArrayList<PostList> post = new ArrayList<>();
        post.add(new PostList("_.dhruvg._", "Back To Campus", "Going back to campus after long time ;)","76", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("Mubashshir Uddin", "Gazing at sky", "","64", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("roit_kjrwl", "Mcleod Ganj, Dharamshala", "","112", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("naman_nhhaparia_", "", "Time for some cool pic","70", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("roit_kjrwl", "Mcleod Ganj, Dharamshala", "","112", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("roit_kjrwl", "Mcleod Ganj, Dharamshala", "","112", R.drawable.sample_post, R.drawable.pm));
        post.add(new PostList("roit_kjrwl", "Mcleod Ganj, Dharamshala", "","112", R.drawable.sample_post, R.drawable.pm));
        
        PostAdapter postAdapter=new PostAdapter(this, post);
        ListView listView=(ListView)findViewById(R.id.new_posts);
        listView.setAdapter(postAdapter);
    }
}