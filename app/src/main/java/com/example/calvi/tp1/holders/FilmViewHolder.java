package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Film;

public class FilmViewHolder extends RecyclerView.ViewHolder {

    private ImageView filmImage;
    private TextView filmTitre;
    private TextView filmDescription;

    public FilmViewHolder(@NonNull View itemView) {
        super(itemView);
        filmImage = itemView.findViewById(R.id.filmImage);
        filmTitre = itemView.findViewById(R.id.filmTitre);
        filmDescription = itemView.findViewById(R.id.filmDescription);
    }

    public void layoutForFilm (Film film) {

        filmImage.setImageResource(R.drawable.user);
        filmTitre.setText(film.getTitre());
        filmDescription.setText(film.getDescription());
    }
}
