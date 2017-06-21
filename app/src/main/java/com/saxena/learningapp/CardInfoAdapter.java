package com.saxena.learningapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Administrator on 4/14/2017.
 */

public class CardInfoAdapter extends RecyclerView.Adapter<CardInfoAdapter.ContactViewHolder> {
    ArrayList<CardInfo> cardInfos =new ArrayList<CardInfo>();
    CardInfoAdapter(ArrayList<CardInfo> cardInfos){
        this.cardInfos = cardInfos;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card,parent,false);
        ContactViewHolder contactViewHolder=new ContactViewHolder(view);

        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        CardInfo CON= cardInfos.get(position);
        holder.person_img.setImageResource(CON.getImage_id());
        holder.person_name.setText(CON.getName());
        holder.person_email.setText(CON.getQuote());
    }

    @Override
    public int getItemCount() {
        return cardInfos.size();
    }
    public static class ContactViewHolder extends RecyclerView.ViewHolder{
        ImageView person_img;
        TextView person_name,person_email,person_mobile;
        ContactViewHolder(View view){
            super(view);
            person_img=(ImageView)view.findViewById(R.id.person_image);
            person_name=(TextView) view.findViewById(R.id.person_name);
            person_email=(TextView)view.findViewById(R.id.person_email);

        }
    }
}
