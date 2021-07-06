package com.example.recyclerviewexercise5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexercise5.adapter.FoodAdapter;
import com.example.recyclerviewexercise5.model.Food;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    FoodAdapter foodAdapter;
    ArrayList<Food> foods = new ArrayList<Food>();
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        recyclerView = findViewById(R.id.rvFood);

        initList();
        initRecyclerView();
    }

    private void initList() {
        foods.add(new Food("https://cdn.pixabay.com/photo/2017/06/01/07/15/food-2362678_640.jpg", "HEADER"));
        String[] foodImages = {"https://cdn.pixabay.com/photo/2016/11/18/17/42/barbecue-1836053_640.jpg",
        "https://cdn.pixabay.com/photo/2016/07/11/03/23/chicken-rice-1508984_640.jpg",
                "https://cdn.pixabay.com/photo/2017/03/30/08/10/chicken-intestine-2187505_640.jpg",
                "https://cdn.pixabay.com/photo/2017/02/15/15/17/meal-2069021_640.jpg",
                "https://cdn.pixabay.com/photo/2017/06/01/07/15/food-2362678_640.jpg"};
        String[] foodTitle = {"5 in 1 Chicken Zinger Box",
                "Paneer Butter Masala",
                "Chicken Lollipop Masala", "Paneer Manchurian", "Non-Veg. Lemon & Coriander Soup"};
        String[] foodDescription = {"Chicken zinger+hot wings [2 pieces]+veg strip [1 piece]+Pillsbury cookie cake+Pepsi [can]",
                "A spicy North Indian dish made from cottage cheese, cream, butter and select spices",
                "Chicken wings coated with batter of flour",
                "Deep-fried cottage cheese balls sautéed with ginger", "Meat shreds, lime juice and coriander"};
        double[] foodPrice = {10.0, 20.0, 30.0, 40.0, 50.0};

        for (int i = 0; i < foodImages.length; i++) {
            foods.add(new Food(foodImages[i], foodTitle[i], foodDescription[i], foodPrice[i], "FOOD"));
        }
    }
    private void initRecyclerView(){
        foodAdapter = new FoodAdapter(this,foods);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);
    }
}