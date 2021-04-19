package com.example.android.cloneapp.messages;

import android.widget.ImageView;

public class MessageList {
    private String mName, mMessage, mTime;
    private int mImageView;

    public MessageList(String s1, String s2, String s3, int i1){
        mName =s1;
        mMessage =s2;
        mTime =s3;
        mImageView =i1;
    }
    public String getName(){
        return mName;
    }
    public String getMessage(){
        return mMessage;
    }
    public String getTime(){
        return mTime;
    }
    public int getImage(){
        return mImageView;
    }
}