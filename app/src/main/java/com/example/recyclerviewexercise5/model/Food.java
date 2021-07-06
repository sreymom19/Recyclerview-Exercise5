package com.example.recyclerviewexercise5.model;

public class Food {
    private String imageHeader;
    private String imageFood;
    private String foodTitle;
    private String foodDescription;
    private double foodPrice;
    private String type;

    public Food(String imageHeader, String type){
        this.imageHeader = imageHeader;
        this.type = type;
    }

    public Food( String imageFood, String foodTitle, String foodDescription, double foodPrice, String type){
        this.imageFood = imageFood;
        this.foodTitle = foodTitle;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
        this.type = type;

    }

    public void setImageHeader(String  imageHeader) {
        this.imageHeader = imageHeader;
    }

    public String getImageHeader() {
        return imageHeader;
    }

    public void setImageFood(String imageFood) {
        this.imageFood = imageFood;
    }

    public String getImageFood() {
        return imageFood;
    }

    public void setFoodTitle(String foodTitle) {
        this.foodTitle = foodTitle;
    }

    public String getFoodTitle() {
        return foodTitle;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
