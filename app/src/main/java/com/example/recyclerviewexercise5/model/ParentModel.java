package com.example.recyclerviewexercise5.model;

import androidx.recyclerview.widget.RecyclerView;

public class ParentModel {

    private String tvCategory;


    public ParentModel (String tvCategory){
        this.tvCategory = tvCategory;

    }

    public String getTvCategory() {
        return tvCategory;
    }

    public void setTvCategory(String tvCategory) {
        this.tvCategory = tvCategory;
    }


}
