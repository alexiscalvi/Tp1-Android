package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Comment;

public class CommentViewHolder extends RecyclerView.ViewHolder {

    private ImageView commentImage;
    private TextView commentAuteur;
    private TextView commentContent;

    public CommentViewHolder(@NonNull View itemView) {
        super(itemView);

        commentImage = itemView.findViewById(R.id.commentImage);
        commentAuteur = itemView.findViewById(R.id.commentAuteur);
        commentContent = itemView.findViewById(R.id.commentContent);
    }

    public void layoutForComment (Comment comment) {

        commentImage.setImageResource(R.drawable.user);
        commentAuteur.setText(comment.getAuteur());
        commentContent.setText(comment.getContent());
    }
}
