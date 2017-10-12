package com.example.ajay.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> SubjectNames;
    RecyclerView recyclerview;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = (RecyclerView)findViewById(R.id.recyclerview1);

        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerview.setLayoutManager(RecyclerViewLayoutManager);

        AddItemsToRecyclerViewArrayList();

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(SubjectNames);

        recyclerview.setAdapter(adapter);
    }
    public void AddItemsToRecyclerViewArrayList(){

        SubjectNames = new ArrayList<>();
        SubjectNames.add("ANDROID");
        SubjectNames.add("ANDROID");
        SubjectNames.add("ANDROID");
        SubjectNames.add("ANDROID");


    }
}
