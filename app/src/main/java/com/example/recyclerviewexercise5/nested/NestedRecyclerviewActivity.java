package com.example.recyclerviewexercise5.nested;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexercise5.R;
import com.example.recyclerviewexercise5.model.ParentModel;

import java.util.ArrayList;

public class NestedRecyclerviewActivity extends AppCompatActivity {

    ArrayList<ParentModel> parentModel = new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;
    ParentAdapter parentAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_recyclerview);

        recyclerView = findViewById(R.id.rvNested);
        initParentList();
        initList();
    }
    private void initParentList(){
        parentModel.add(new ParentModel("Feature"));
        parentModel.add(new ParentModel("Animation"));
    }
    private void initList(){
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        parentAdapter = new ParentAdapter(this,parentModel);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(parentAdapter);
    }

}
