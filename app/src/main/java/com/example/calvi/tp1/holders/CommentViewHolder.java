package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Comment;

public class CommentViewHolder extends RecyclerView.ViewHolder {

    private TextView commentText;

    public CommentViewHolder(@NonNull View itemView) {
        super(itemView);
        commentText = itemView.findViewById(R.id.comment_text);
    }

    public void layoutForComment(Comment comment) {
        commentText.setText(comment.getComment());
    }
}
