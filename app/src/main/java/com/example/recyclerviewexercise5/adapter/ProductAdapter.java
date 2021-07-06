package com.example.recyclerviewexercise5.adapter;

import android.content.Context;
import android.os.ProxyFileDescriptorCallback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    ArrayList<Product> products;

    public ProductAdapter(Context context,ArrayList<Product> products){
        this.context = context;
        this.products = products;
    }


    @Override
    public ProductViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.item_product_layout,parent,false));
    }

    @Override
    public void onBindViewHolder( ProductAdapter.ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.bindViewProduct(product);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView productTitle;
        TextView productDes;

        public ProductViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.ivproduct);
            productTitle = itemView.findViewById(R.id.tvProductTitle);
            productDes = itemView.findViewById(R.id.tvProductDes);
        }

        public void bindViewProduct(Product product){
            imageView.setImageResource(product.getImageView());
            productTitle.setText(product.getProductTitle());
            productDes.setText(product.getProductDes());
        }
    }
}
