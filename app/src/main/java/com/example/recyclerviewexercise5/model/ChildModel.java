package com.example.recyclerviewexercise5.model;

public class ChildModel {

    private String imageViewChild;
    private String tvChildTitle;

    public ChildModel(String imageViewChild, String tvChildTitle){
        this.imageViewChild = imageViewChild;
        this.tvChildTitle = tvChildTitle;
    }

    public String getImageViewChild() {
        return imageViewChild;
    }

    public void setImageViewChild(String imageViewChild) {
        this.imageViewChild = imageViewChild;
    }

    public String getTvChildTitle() {
        return tvChildTitle;
    }

    public void setTvChildTitle(String tvChildTitle) {
        this.tvChildTitle = tvChildTitle;
    }
}
