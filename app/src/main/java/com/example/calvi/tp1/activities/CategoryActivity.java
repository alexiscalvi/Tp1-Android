package com.example.calvi.tp1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.adapters.CategoryAdapter;
import com.example.calvi.tp1.entities.Category;
import com.example.calvi.tp1.entities.Film;
import com.example.calvi.tp1.interfaces.Entity;
import com.example.calvi.tp1.interfaces.OnClickManager;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity implements RecyclerViewManager, OnClickManager {

    private ArrayList<Entity> listCategories = new ArrayList<Entity>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.category_activity);

        listCategories.add(new Category("Humour"));
        listCategories.add(new Category("Film d'horreur"));
        listCategories.add(new Category("Drame"));
        listCategories.add(new Category("Thriller"));
        RecyclerView listViewCategories = findViewById(R.id.recyclerViewCategories);

        CategoryAdapter adapter = new CategoryAdapter();
        adapter.setRecyclerViewManager(this);
        listViewCategories.setAdapter(adapter);
        listViewCategories.setLayoutManager(new LinearLayoutManager(this));
        adapter.setOnClickManager(this);

    }

    @Override
    public ArrayList<Entity> getEntities() {
        return listCategories;
    }

    @Override
    public int getNumberOfEntities() {
        return listCategories.size();
    }

    @Override
    public void onClickItemFilm(Film film) {

    }

    @Override
    public void onClickItemCategorie(Category category) {
        Intent i = new Intent(CategoryActivity.this, FilmActivity.class);
        startActivity(i);
    }
}
