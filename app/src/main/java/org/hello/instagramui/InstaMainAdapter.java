package org.hello.instagramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InstaMainAdapter  extends  RecyclerView.Adapter<InstaMainAdapter.MyViewHolderMain>{

    private static final String TAG = "InstaMainAdapter";

    private List<Integer> items  = new ArrayList<>();

    public void addItem(int img){
        items.add(img);
    }

    @NonNull
    @Override
    public MyViewHolderMain onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_content, parent, false);
        return new MyViewHolderMain(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderMain holder, int position) {
        int  imgMain = items.get(position);
        holder.setItem(imgMain);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolderMain extends RecyclerView.ViewHolder{

        private ImageView ivImgResourceMain;


        public MyViewHolderMain(@NonNull View itemView) {
            super(itemView);

            ivImgResourceMain = itemView.findViewById(R.id.iv_img_resource_main);
        }

        public  void setItem(int img){
            ivImgResourceMain.setImageResource(img);
        }
    }
}
