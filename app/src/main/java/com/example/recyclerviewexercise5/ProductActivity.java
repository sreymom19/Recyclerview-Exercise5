package com.example.recyclerviewexercise5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexercise5.adapter.ProductAdapter;
import com.example.recyclerviewexercise5.model.Product;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    ProductAdapter productAdapter;
    LinearLayoutManager layoutManager;
    ArrayList<Product> products = new ArrayList<Product>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = findViewById(R.id.productRecyclerview);


        initList();
        initLayout();
    }

    public void initList(){
        for (int i=0; i<20; i++){
        products.add(new Product(
                R.drawable.danalac,
                "Danalac",
                "Good item"
        ));
        }
    }
    public void initLayout(){
        productAdapter = new ProductAdapter(this,products);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}