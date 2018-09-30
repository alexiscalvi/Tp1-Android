package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Category;
import com.example.calvi.tp1.interfaces.OnClickManager;

public class CategorieViewHolder extends RecyclerView.ViewHolder {

    private TextView textCategory;
    private OnClickManager onClickManager;
    public CategorieViewHolder(@NonNull View itemView) {
        super(itemView);
        textCategory = itemView.findViewById(R.id.button_one_category);
    }

    public void layoutForCategory(Category filmCategorie) {
        final Category category = filmCategorie;
        textCategory.setText(filmCategorie.getNom());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickManager.onClickItemCategorie(category);
            }
        });
    }

    public OnClickManager getOnClickManager() {
        return onClickManager;
    }

    public void setOnClickManager(OnClickManager onClickManager) {
        this.onClickManager = onClickManager;
    }
}