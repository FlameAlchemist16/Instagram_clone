package com.example.android.cloneapp.posts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.cloneapp.R;

import java.util.ArrayList;

/*
This is an custom arrayAdapter created by @FlameAlchemist16
 */

public class PostAdapter extends ArrayAdapter<PostList> {

    /*
     *This is custom constructor to display the posts
     * variables are just context that is the current activity and postList that is the values to be displayed stored in our
     * PostList class
     */
    public PostAdapter(Activity context, ArrayList<PostList> postList){

        super(context,0,postList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View postView = convertView;
        if(postView == null){
            postView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_posts, parent, false);
        }
        PostList post = getItem(position);
        TextView itemText = (TextView) postView.findViewById(R.id.AccountName);
        itemText.setText(post.getAccountName());
        TextView itemText1= (TextView) postView.findViewById(R.id.accountName);
        itemText1.setText(post.getAccountName());
        TextView itemText3 =(TextView) postView.findViewById(R.id.tagLine);
        itemText3.setText(post.getPostTagline());
        TextView itemText4 =(TextView) postView.findViewById(R.id.description);
        itemText4.setText(post.getPostDescription());
        ImageView imageView=(ImageView) postView.findViewById(R.id.accountPicture);
        imageView.setImageResource(post.getAccountPicture());
        ImageView imageView1=(ImageView) postView.findViewById(R.id.post);
        imageView1.setImageResource(post.getPost());
        TextView itemText5 =(TextView) postView.findViewById(R.id.likes);
        itemText5.setText(post.getLikes());
        return postView;
    }
}