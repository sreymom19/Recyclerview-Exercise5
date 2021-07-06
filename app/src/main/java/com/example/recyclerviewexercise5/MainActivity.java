package com.example.recyclerviewexercise5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewexercise5.adapter.BookAdapter;
import com.example.recyclerviewexercise5.model.BookModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BookAdapter bookAdapter;
    LinearLayoutManager layoutManager;
    ArrayList<BookModel> bookModels;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvBook);


        initList();
        initRecyclerView();


    }

    public void initList(){
        bookModels = new ArrayList<>();
        for ( int i=0; i<20; i++){
        bookModels.add(new BookModel(
                R.drawable.book,
                "Text",
                "Athour"
        ));
        }
    }

    public void initRecyclerView(){
        bookAdapter = new BookAdapter(this,bookModels);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bookAdapter);

    }
}