package com.example.devpro_btvn_buoi4_newfeeds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNewFeed;
    private ArrayList<NewFeeds> mNewFeedList;
    private NewFeedAdapter newFeedAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        rvNewFeed=findViewById(R.id.rcv_newfeed);
        newFeedAdapter=new NewFeedAdapter(mNewFeedList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvNewFeed.setLayoutManager(linearLayoutManager);
        rvNewFeed.setAdapter(newFeedAdapter);
    }

    private void initData() {
        mNewFeedList=new ArrayList<>();
        for(int i=0;i<5;i++){
            NewFeeds newFeeds=new NewFeeds();
            newFeeds.setCheck(false);
            newFeeds.setAvt(R.drawable.avt);
            newFeeds.setAnh(R.drawable.lbui);
            newFeeds.setLike(i+"");
            newFeeds.setComment(i+" Binh luan");
            newFeeds.setShare(i+" Chia se");
            newFeeds.setContent("Don’t cry because it’s over, smile because it happened "+ i);
            newFeeds.setTenTK("Luong Bui "+i);
            mNewFeedList.add(newFeeds);
        }
    }
}