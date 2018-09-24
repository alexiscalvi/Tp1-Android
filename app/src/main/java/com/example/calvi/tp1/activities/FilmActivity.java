package com.example.calvi.tp1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.adapters.FilmAdapter;
import com.example.calvi.tp1.adapters.LettreAdapter;
import com.example.calvi.tp1.entities.Film;
import com.example.calvi.tp1.entities.Lettre;
import com.example.calvi.tp1.interfaces.Entity;
import com.example.calvi.tp1.interfaces.OnClickManager;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;
import com.example.calvi.tp1.managers.MovieManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class FilmActivity extends AppCompatActivity implements RecyclerViewManager, OnClickManager {

    private ArrayList<Entity> listFilms = new ArrayList<Entity>();
    private ArrayList<Entity> listLettres = new ArrayList<Entity>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
   setContentView(R.layout.film_activity);
   /*

        char lettres[] = {'a','b','c','d','e','f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r','s','t','u','v','w','x','y','z'};

        for(char lettre : lettres){
            listLettres.add(new Lettre(String.valueOf(lettre), "0"));
        }
        RecyclerView listViewLettres = findViewById(R.id.recyclerViewLettre);

        LettreAdapter lettreAdapter = new LettreAdapter();
        lettreAdapter.setRecyclerViewManager(this);
        listViewLettres.setAdapter(lettreAdapter);
        listViewLettres.setLayoutManager(new LinearLayoutManager(this));
*/


        MovieManager.getInstance().addFilm(new Film("Test", "dsghfds", 0 ));
        MovieManager.getInstance().addFilm(new Film("Poi", "dsghfds", 1));
        MovieManager.getInstance().addFilm(new Film("Rs", "dsghfds", 2));
        MovieManager.getInstance().addFilm(new Film("Test", "dsghfds", 3));
        MovieManager.getInstance().addFilm(new Film("Test", "dsghfds", 4));



        RecyclerView listViewFilms = findViewById(R.id.recyclerViewFilms);

        FilmAdapter adapter = new FilmAdapter();
        adapter.setOnClickManager(this);
        adapter.setRecyclerViewManager(this);
        listViewFilms.setAdapter(adapter);
        listViewFilms.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public ArrayList<Entity> getEntities() {
        return MovieManager.getInstance().getMovies();
    }

    @Override
    public int getNumberOfEntities() {
        return MovieManager.getInstance().getMovies().size();
    }

    @Override
    public void onClickItemFilm(Film film) {
        System.out.println(film.getId());
        Intent i = new Intent(FilmActivity.this, MainActivity.class);

        i.putExtra("ID_FILM", film.getId());
        startActivity(i);
    }
}
