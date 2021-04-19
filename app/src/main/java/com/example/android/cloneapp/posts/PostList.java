package com.example.android.cloneapp.posts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PostList{
    private String mAccountName, mPostTagline, mPostDescription, mLikes;
    private int mPost, mAccountPicture;

    public PostList(String s1,String s2,String s3,String i1,int i2,int i3){
        mAccountName =s1;
        mPostTagline =s2;
        mPostDescription =s3;
        mLikes =i1+" likes";
        mPost =i2;
        mAccountPicture =i3;
    }
    public String getAccountName(){
        return mAccountName;
    }
    public String getPostTagline(){
        return mPostTagline;
    }
    public String getPostDescription(){
        return mPostDescription;
    }
    public String getLikes(){
        return mLikes;
    }
    public int getPost(){
        return mPost;
    }
    public int getAccountPicture(){
        return mAccountPicture;
    }
}