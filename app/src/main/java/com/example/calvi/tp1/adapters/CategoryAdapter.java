package com.example.calvi.tp1.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calvi.tp1.holders.CategorieViewHolder;
import com.example.calvi.tp1.entities.Category;
import com.example.calvi.tp1.R;
import com.example.calvi.tp1.holders.FilmViewHolder;
import com.example.calvi.tp1.interfaces.OnClickManager;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

public class CategoryAdapter extends RecyclerView.Adapter {

    private RecyclerViewManager recyclerViewManager;
    private OnClickManager onClickManager;
    public void setRecyclerViewManager(RecyclerViewManager manager) {
        this.recyclerViewManager = manager;
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_button, viewGroup, false);
        RecyclerView.ViewHolder vh = new CategorieViewHolder(mView);
        if(vh instanceof CategorieViewHolder){
            ((CategorieViewHolder) vh).setOnClickManager(this.onClickManager);
        }
        return vh;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        CategorieViewHolder vh = (CategorieViewHolder) viewHolder;
        Category category = (Category) recyclerViewManager.getEntities().get(i);
        vh.layoutForCategory(category);
    }

    public int getItemCount() {
        return recyclerViewManager.getNumberOfEntities();
    }

    public OnClickManager getOnClickManager() {
        return onClickManager;
    }

    public void setOnClickManager(OnClickManager onClickManager) {
        this.onClickManager = onClickManager;
    }
}
