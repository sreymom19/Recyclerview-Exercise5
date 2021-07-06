    package com.example.recyclerviewexercise5.nested;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.ChildModel;
import com.example.recyclerviewexercise5.model.ParentModel;

import java.util.ArrayList;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {

    private Context context;
    private ArrayList<ParentModel> parentModels;

    public ParentAdapter(Context context, ArrayList<ParentModel> parentModels) {
        this.context = context;
        this.parentModels = parentModels;
    }


    @Override
    public ParentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ParentViewHolder(LayoutInflater.from(context).inflate(R.layout.parent_layout,parent,false));
        //inflate layout here for parent adapater
    }

    @Override
    public void onBindViewHolder(ParentViewHolder holder, int position) {
        ParentModel parentModel = parentModels.get(position);
        holder.parentBindView(context,parentModel);
    }

    @Override
    public int getItemCount() {
        return parentModels.size();
    }

    public class ParentViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCategoryTitle;
        private RecyclerView rvChild;

        public ParentViewHolder(View itemView) {
            super(itemView);
            tvCategoryTitle = itemView.findViewById(R.id.tvCategory);
            rvChild = itemView.findViewById(R.id.rvRecyclerParent);
        }

        public void parentBindView(Context context,ParentModel parentModel) {

            tvCategoryTitle.setText(parentModel.getTvCategory());
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
            ChildAdapter childAdapter = new ChildAdapter(context,getChildList(parentModel.getTvCategory()));
            rvChild.setLayoutManager(layoutManager);
            rvChild.setAdapter(childAdapter);


        }

        private ArrayList<ChildModel> getChildList(String category) {
            ArrayList<ChildModel> childModels = new ArrayList<>();
            switch (category) {
                case "Feature":
                    for (int i = 0; i < 10; i++) {
                        childModels.add(new ChildModel("https://i.ytimg.com/vi/4FzD-kTJ4lc/maxresdefault.jpg", "Kalki Full Movie" + i));
                    }
                    break;
                case "Animation":
                    for (int i = 0; i < 10; i++) {
                        childModels.add(new ChildModel("https://ichef.bbci.co.uk/news/976/cpsprodpb/17AB3/production/_117674969_godzilla.png", "Kalki Full Movie" + i));
                    }
                    break;
            }
            return childModels;
        }
    }
}
