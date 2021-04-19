package com.example.android.cloneapp.messages;

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
public class MessageAdapter extends ArrayAdapter<MessageList> {

    /*
    *This is custom constructor to display the messenger chats
    * variables are just context that is the current activity and messageList that is the values to be displayed stored in our
    * MessageList class
     */
    public MessageAdapter(Activity context, ArrayList<MessageList> messageList){

        super(context,0,messageList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View recycleView = convertView;
        if(recycleView == null){
            recycleView = LayoutInflater.from(getContext()).inflate(
                    R.layout.messenging_list, parent, false);
        }
        MessageList messages = getItem(position);
        TextView itemText = (TextView) recycleView.findViewById(R.id.userName);
        itemText.setText(messages.getName());
        TextView itemText1= (TextView) recycleView.findViewById(R.id.textMessage);
        itemText1.setText(messages.getMessage());
        TextView itemText3 =(TextView) recycleView.findViewById(R.id.time1);
        itemText3.setText(messages.getTime());
        ImageView imageView=(ImageView) recycleView.findViewById(R.id.profilePic);
        imageView.setImageResource(messages.getImage());
        return recycleView;
    }
}