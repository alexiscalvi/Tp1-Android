package com.example.calvi.tp1.entities;

import android.content.ContentValues;

import com.example.calvi.tp1.interfaces.Entity;

public class Film implements Entity {
    private String titre;
    private String description;

    public Film(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
