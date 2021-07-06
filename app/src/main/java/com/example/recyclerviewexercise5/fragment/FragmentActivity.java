package com.example.recyclerviewexercise5.fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerviewexercise5.R;

public class FragmentActivity extends AppCompatActivity {

    Button btnFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        addFragmentRunTime();

        btnFragment = findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment();
            }
        });

    }

    public void addFragmentRunTime(){
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frameFragment,fragmentA);
        fragmentTransaction.commit();

    }

    public void replaceFragment(){
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameFragment,fragmentB);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
