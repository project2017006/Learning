package com.saxena.learningapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Administrator on 6/21/2017.
 */

public class Select extends AppCompatActivity {
    CardView cardView;
    ImageView imageView;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<CardInfo> list=new ArrayList<CardInfo>();
    int[] image_id={
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.tenth,
            R.drawable.eleven,
            R.drawable.twelve,
            R.drawable.cat,
            R.drawable.gre,
            R.drawable.gmat,
    };
    String[] name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_course_select);
        cardView=(CardView)findViewById(R.id.card_view);
        imageView=(ImageView)findViewById(R.id.person_image);
        name=getResources().getStringArray(R.array.person_name);
        email=getResources().getStringArray(R.array.person_email);

        int count=0;
        for (String Name:name){
            CardInfo cardInfo =new CardInfo(image_id[count],name[count],email[count]);
            count++;
            list.add(cardInfo);
        }
        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter=new CardInfoAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
