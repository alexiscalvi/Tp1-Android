package com.example.calvi.tp1.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Comment;
import com.example.calvi.tp1.entities.Film;
import com.example.calvi.tp1.holders.CommentViewHolder;
import com.example.calvi.tp1.holders.FilmViewHolder;
import com.example.calvi.tp1.interfaces.OnClickManager;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

public class FilmAdapter extends RecyclerView.Adapter {

    private RecyclerViewManager manager;
    private OnClickManager onClickManager;

    public void setRecyclerViewManager(RecyclerViewManager manager) {
        this.manager = manager;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.film_block, viewGroup, false);
        RecyclerView.ViewHolder vh = new FilmViewHolder(mView);
        if(vh instanceof FilmViewHolder){
            ((FilmViewHolder) vh).setOnClickManager(this.onClickManager);
        }
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        FilmViewHolder vh = (FilmViewHolder)viewHolder;
        Film film = (Film) manager.getEntities().get(i);
        vh.layoutForFilm(film);
    }

    @Override
    public int getItemCount() {
        return manager.getNumberOfEntities();
    }

    public OnClickManager getOnClickManager() {
        return onClickManager;
    }

    public void setOnClickManager(OnClickManager onClickManager) {
        this.onClickManager = onClickManager;
    }
}
