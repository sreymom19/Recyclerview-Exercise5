package com.example.recyclerviewexercise5.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.Food;

public class ItemFoodHeaderViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;

    public ItemFoodHeaderViewHolder(View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.ivFoodHeader);
    }
    public void bindFoodHeader(Context context,Food food){
        Glide.with(context).load(food.getImageHeader()).into(imageView);

    }

}
