package com.example.calvi.tp1.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Lettre;
import com.example.calvi.tp1.holders.LettreViewHolder;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

public class LettreAdapter extends RecyclerView.Adapter {

    private RecyclerViewManager manager;

    public void setRecyclerViewManager(RecyclerViewManager manager) {
        this.manager = manager;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lettre_block, viewGroup, false);
        RecyclerView.ViewHolder vh = new LettreViewHolder(mView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        LettreViewHolder vh = (LettreViewHolder)viewHolder;
        Lettre lettre = (Lettre) manager.getEntities().get(i);
        vh.layoutForLettre(lettre);
    }

    @Override
    public int getItemCount() {
        return manager.getNumberOfEntities();
    }
}
