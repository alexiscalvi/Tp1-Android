package com.example.calvi.tp1.entities;

import com.example.calvi.tp1.interfaces.Entity;

public class Category implements Entity {

    private String nom;

    public Category(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

}
