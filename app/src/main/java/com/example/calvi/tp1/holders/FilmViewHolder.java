package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Film;
import com.example.calvi.tp1.interfaces.OnClickManager;

public class FilmViewHolder extends RecyclerView.ViewHolder {

    private ImageView filmImage;
    private TextView filmTitre;
    private TextView filmDescription;
    private OnClickManager onClickManager;


    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        filmImage = itemView.findViewById(R.id.filmImage);
        filmTitre = itemView.findViewById(R.id.filmTitre);
        filmDescription = itemView.findViewById(R.id.filmDescription);
    }

    public void layoutForFilm (Film film) {

        final Film movie = film;
        filmImage.setImageResource(R.drawable.user);
        filmTitre.setText(film.getTitre());
        filmDescription.setText(film.getDescription());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickManager.onClickItemFilm(movie);
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
