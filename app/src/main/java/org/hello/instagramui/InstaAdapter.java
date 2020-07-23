package org.hello.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InstaAdapter extends RecyclerView.Adapter<InstaAdapter.MyViewHolder>{

    private static final String TAG = "InstaAdapter";
    private List<Integer> items = new ArrayList<>();

    public void addItem(int  img){
        items.add(img);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile, parent, false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int headImg = items.get(position);
        holder.setItem(headImg);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivImgResourceHead;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            ivImgResourceHead = itemView.findViewById(R.id.iv_img_resource_head);
        }

        public void setItem(int img){

            ivImgResourceHead.setImageResource(img);
        }
    }
}
