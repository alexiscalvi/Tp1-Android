package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Category;

public class CategorieViewHolder extends RecyclerView.ViewHolder {

    private TextView textCategory;

    public CategorieViewHolder(@NonNull View itemView) {
        super(itemView);
        textCategory = itemView.findViewById(R.id.button_one_category);
    }

    public void layoutForCategory(Category filmCategorie) {
        textCategory.setText(filmCategorie.getNom());
    }
}