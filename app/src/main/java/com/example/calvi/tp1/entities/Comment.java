package com.example.calvi.tp1.entities;

import com.example.calvi.tp1.interfaces.Entity;

public class Comment implements Entity {

    private String auteur;
    private String image;
    private String comment;

    public Comment(String auteur, String image, String comment) {
        this.auteur = auteur;
        this.image = image;
        this.comment = comment;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getImage() {
        return image;
    }

    public String getComment() {
        return comment;
    }
}
