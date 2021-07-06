package com.example.recyclerviewexercise5.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.Food;


public class ItemFoodViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageFood;
    private TextView foodTitle;
    private TextView foodDes;
    private TextView foodPrice;

    public ItemFoodViewHolder(View itemView){
        super(itemView);
        imageFood = itemView.findViewById(R.id.ivFoodImage);
        foodTitle = itemView.findViewById(R.id.tvFoodTitle);
        foodDes = itemView.findViewById(R.id.tvFoodDes);
        foodPrice = itemView.findViewById(R.id.tvFoodPrice);
    }
    public void bindFood(Context context, Food food){
        Glide.with(context).load(food.getImageFood()).into(imageFood);
        foodTitle.setText(food.getFoodTitle());
        foodDes.setText(food.getFoodDescription());
        foodPrice.setText("$ "+food.getFoodPrice());
    }
}
