package com.example.calvi.tp1.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calvi.tp1.entities.Comment;
import com.example.calvi.tp1.R;
import com.example.calvi.tp1.holders.CommentViewHolder;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

public class CommentAdapter extends RecyclerView.Adapter {

    private RecyclerViewManager recyclerViewManager;

    public void setRecyclerViewManager(RecyclerViewManager manager) {
        this.recyclerViewManager = manager;
        System.out.print("ouuiiiiiiiiiii " + manager.getNumberOfEntities());
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_block, viewGroup, false);
        RecyclerView.ViewHolder vh = new CommentViewHolder(mView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        CommentViewHolder vh = (CommentViewHolder) viewHolder;
        Comment comment = (Comment) recyclerViewManager.getEntities().get(i);
        vh.layoutForComment(comment);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
