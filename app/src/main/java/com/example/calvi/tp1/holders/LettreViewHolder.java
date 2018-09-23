package com.example.calvi.tp1.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.entities.Comment;
import com.example.calvi.tp1.entities.Lettre;

public class LettreViewHolder extends RecyclerView.ViewHolder {

    private TextView mylettre;
    private TextView nombre;
    public LettreViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mylettre = itemView.findViewById(R.id.lettre);
        this.nombre = itemView.findViewById(R.id.nombre);

    }


    public void layoutForLettre (Lettre lettre) {

        mylettre.setText(lettre.getLettre());
        nombre.setText(lettre.getNombre());
    }
}
