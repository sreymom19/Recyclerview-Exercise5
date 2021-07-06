package com.example.recyclerviewexercise5.model;

public class Product {

    int imageView;
    String productTitle;
    String productDes;

    public Product(int imageView, String productTitle, String productDes){
        this.imageView = imageView;
        this.productTitle = productTitle;
        this.productDes = productDes;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public String getProductDes() {
        return productDes;
    }
}
