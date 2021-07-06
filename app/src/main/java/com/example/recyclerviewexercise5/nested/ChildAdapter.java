package com.example.recyclerviewexercise5.nested;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.ChildModel;

import java.util.ArrayList;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder> {

    Context context;
    ArrayList<ChildModel> childModels;

    public ChildAdapter(Context context, ArrayList<ChildModel> childList) {
        this.context = context;
        this.childModels = childList;
    }

    @Override
    public ChildViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new ChildViewHolder(LayoutInflater.from(context).inflate(R.layout.child_layout,parent,false));
    }

    @Override
    public void onBindViewHolder( ChildAdapter.ChildViewHolder holder, int position) {
        ChildModel childModel = childModels.get(position);
        holder.childBindView(childModel);


    }

    @Override
    public int getItemCount() {
        return childModels.size();
    }

    public class ChildViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewChile;
        private TextView tvChileTitle;

        public ChildViewHolder (View itemView){
            super(itemView);
            imageViewChile = itemView.findViewById(R.id.imageViewChild);
            tvChileTitle = itemView.findViewById(R.id.tvChildTitle);
        }

        public void childBindView(ChildModel childModel){
            Glide.with(context).load(childModel.getImageViewChild()).into(imageViewChile);
            tvChileTitle.setText(childModel.getTvChildTitle());
        }

    }

}
