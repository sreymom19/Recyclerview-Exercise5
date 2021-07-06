package com.example.recyclerviewexercise5.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.BookModel;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    Context context;
    ArrayList<BookModel> bookModels;

    public BookAdapter(Context context,ArrayList<BookModel> bookModels){
        this.context = context;
        this.bookModels=bookModels;
    }


    @Override
    public BookViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(context).inflate(R.layout.item_book_layout,parent,false));
    }

    @Override
    public void onBindViewHolder( BookAdapter.BookViewHolder holder, int position) {
        BookModel bookModel = bookModels.get(position);
        holder.bindView(bookModel);

    }

    @Override
    public int getItemCount() {
        return bookModels.size();
    }


    public class BookViewHolder extends RecyclerView.ViewHolder{
        ImageView ivBook;
        TextView tvTitle;
        TextView tvAuthor;

        public BookViewHolder(View itemView){
            super(itemView);
            ivBook = itemView.findViewById(R.id.ivBook);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);

        }
        // create bind fuction
        public void bindView(BookModel bookModel){
            ivBook.setImageResource(bookModel.getImageView());
            tvTitle.setText(bookModel.getBookTitle());
            tvAuthor.setText(bookModel.getBookAuthor());
        }

    }
}
