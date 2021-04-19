package com.example.android.cloneapp.messages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.android.cloneapp.MainActivity;
import com.example.android.cloneapp.R;

import java.util.ArrayList;

public class MessengingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenging);

        ImageButton ib=(ImageButton)findViewById(R.id.backArrow);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MessengingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ArrayList<MessageList> messages= new ArrayList<MessageList>();

        messages.add(new MessageList("_.dhruvg._","Mentioned you in a story","1 h",R.drawable.pm));
        messages.add(new MessageList("Mubashshir Uddin","Sent a video","2 h",R.drawable.pm));
        messages.add(new MessageList("naman_chhaparia_","Liked a message","20 h",R.drawable.pm));
        messages.add(new MessageList("Neha Tiwari","reacted to your message","1 d",R.drawable.pg));
        messages.add(new MessageList("Roit_kjrwl","jaldi milte hai","2 d",R.drawable.pm));
        messages.add(new MessageList("Shruti","Liked a message","2 d",R.drawable.pg));
        messages.add(new MessageList("Ridhul Sambhod","Liked your message","3 d",R.drawable.pm));
        messages.add(new MessageList("Bhailog OP","Sent a video","1 w",R.drawable.pm));
        messages.add(new MessageList("Vedica Rawat","Could you help me with this, my friend needs financial help.","1 w",R.drawable.pg));
        messages.add(new MessageList("Mira Bansal","reacted to your message","2 w",R.drawable.pg));
        messages.add(new MessageList("RaGHiB AnWAr","Mentioned you in a story","2 w",R.drawable.pm));
        messages.add(new MessageList("Purushottam Ojha","Liked a message","2 w",R.drawable.pm));

        MessageAdapter messageAdapter=new MessageAdapter(this, messages);
        ListView listView=(ListView)findViewById(R.id.messengerView);
        listView.setAdapter(messageAdapter);
    }
}