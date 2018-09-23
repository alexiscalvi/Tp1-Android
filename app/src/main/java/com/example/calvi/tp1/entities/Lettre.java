package com.example.calvi.tp1.entities;


import com.example.calvi.tp1.interfaces.Entity;

public class Lettre implements Entity{

    private String lettre;
    private String nombre;

    public Lettre(String lettre, String nombre) {
        this.lettre = lettre;
        this.nombre = nombre;
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
