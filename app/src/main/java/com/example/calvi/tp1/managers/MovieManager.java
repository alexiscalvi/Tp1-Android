package com.example.calvi.tp1.managers;

import com.example.calvi.tp1.entities.Film;
import com.example.calvi.tp1.interfaces.Entity;

import java.util.ArrayList;

public class MovieManager {
    /** Constructeur privé */
    private MovieManager()
    {}
    private ArrayList<Entity> listFilm = new ArrayList<Entity>();

    /** Instance unique pré-initialisée */
    private static MovieManager INSTANCE = new MovieManager();

    /** Point d'accès pour l'instance unique du singleton */
    public static MovieManager getInstance()
    {
        return INSTANCE;
    }

    public void addFilm(Entity film){
        if(film instanceof Film){
            listFilm.add(film.getId(), film);
        }
    }

    public ArrayList<Entity> getMovies(){
        return listFilm;
    }

    public Entity getMovieById(int index){
        return listFilm.get(index);
    }

}
