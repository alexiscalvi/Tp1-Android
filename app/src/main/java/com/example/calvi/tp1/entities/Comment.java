package com.example.calvi.tp1.entities;

import com.example.calvi.tp1.interfaces.Entity;

public class Comment implements Entity {

    private String auteur;
    private int image;
    private String content;

    public Comment(String auteur, int image, String content) {
        this.auteur = auteur;
        this.image = image;
        this.content = content;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getImage() {
        return image;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int getId() {
        return 0;
    }
}
