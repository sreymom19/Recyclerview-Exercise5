package com.example.recyclerviewexercise5.model;

public class BookModel {
    int imageView;
    String bookTitle;
    String bookAuthor;


    public BookModel(int imageView,String bookTitle, String bookAuthor){
        this.imageView = imageView;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}

