package com.example.devpro_btvn_buoi4_newfeeds;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewFeedAdapter extends RecyclerView.Adapter<NewFeedAdapter.NewFeedViewHolder> {

    private ArrayList<NewFeeds> mNewFeedsList;
    private Context mContext;

    public NewFeedAdapter(ArrayList<NewFeeds> mNewFeedsList) {
        this.mNewFeedsList = mNewFeedsList;
    }

    @NonNull
    @Override
    public NewFeedAdapter.NewFeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.layout_newfeed_recylceview,parent,false);
        return new NewFeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewFeedAdapter.NewFeedViewHolder holder, int position) {
        NewFeeds newFeeds=mNewFeedsList.get(position);

        holder.img_avt.setImageResource(newFeeds.getAvt());
        holder.img_anhHienThi.setImageResource(newFeeds.getAnh());
        holder.tvTenTK.setText(newFeeds.getTenTK());
        holder.tvContent.setText(newFeeds.getContent());
        holder.like.setText(newFeeds.getLike());
        holder.share.setText(newFeeds.getShare());
        holder.comment.setText(newFeeds.getComment());

        holder.linearLayoutLike.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(newFeeds.getCheck()== false ){
                    newFeeds.setCheck(true);
                    holder.btnLike.setTextColor(R.color.blue);
                    holder.imgIconLike.setImageResource(R.drawable.like_icon_chon);
                    int i=Integer.parseInt(holder.like.getText().toString());
                    i++;
                    holder.like.setText(i+"");
                }
                else if(newFeeds.getCheck()== true ){
                    newFeeds.setCheck(false);
                    holder.btnLike.setTextColor(R.color.black);
                    holder.imgIconLike.setImageResource(R.drawable.like_icon);
                    int i=Integer.parseInt(holder.like.getText().toString());
                    i--;
                    holder.like.setText(i+"");
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mNewFeedsList!=null?mNewFeedsList.size() : 0;
    }

    public class NewFeedViewHolder extends RecyclerView.ViewHolder{
        ImageView img_avt,img_anhHienThi,imgIconLike;
        TextView tvTenTK,tvContent,like,comment,share,btnLike;
        LinearLayout linearLayoutLike;

        public NewFeedViewHolder(@NonNull View itemView) {
            super(itemView);

            img_avt=itemView.findViewById(R.id.img_avt);
            img_anhHienThi=itemView.findViewById(R.id.img_anhHienThi);
            tvTenTK=itemView.findViewById(R.id.tv_tenTK);
            tvContent=itemView.findViewById(R.id.tv_content);
            like=itemView.findViewById(R.id.tv_like);
            comment=itemView.findViewById(R.id.tv_comment);
            share=itemView.findViewById(R.id.tv_share);
            linearLayoutLike=itemView.findViewById(R.id.ll_like);
            imgIconLike=itemView.findViewById(R.id.img_like);
            btnLike=itemView.findViewById(R.id.btn_like);
        }
    }
}
