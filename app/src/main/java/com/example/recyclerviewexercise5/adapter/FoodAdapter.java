package com.example.recyclerviewexercise5.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.adapter.viewholder.ItemFoodHeaderViewHolder;
import com.example.recyclerviewexercise5.adapter.viewholder.ItemFoodViewHolder;
import com.example.recyclerviewexercise5.model.Food;

import java.util.ArrayList;

public class    FoodAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int FOOD_HEADER = 1;
    private final int FOOD_ITEM = 2;
    Context context;
    ArrayList<Food> foods;

    public FoodAdapter(Context context, ArrayList<Food> foods) {
        this.context = context;
        this.foods = foods;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType){
            case FOOD_HEADER:
                return new ItemFoodHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.item_food_header_layout,parent,false));
            case FOOD_ITEM:
                return new ItemFoodViewHolder(LayoutInflater.from(context).inflate(R.layout.item_food_layout,parent,false));
            default: return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Food food = foods.get(position);
        if(holder instanceof ItemFoodHeaderViewHolder){
            ((ItemFoodHeaderViewHolder) holder).bindFoodHeader(context,food);
        }else {
            ((ItemFoodViewHolder) holder).bindFood(context,food);
        }

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (foods.get(position).getType()){
            case "HEADER":
                return FOOD_HEADER;
            case "FOOD":
                return FOOD_ITEM;
            default:return 0;
        }
    }
}
