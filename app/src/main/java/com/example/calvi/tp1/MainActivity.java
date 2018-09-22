package com.example.calvi.tp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.calvi.tp1.adapters.CategoryAdapter;
import com.example.calvi.tp1.entities.Category;
import com.example.calvi.tp1.interfaces.Entity;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements RecyclerViewManager {

    private ArrayList<Entity> listCategories = new ArrayList<Entity>();
    private ArrayList<Entity> listComments = new ArrayList<Entity>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        /*
        setContentView(R.layout.activity_main);
        listComments.add(new Comment("Pierre", "test", "blablabla"));
        listComments.add(new Comment("Pierre", "test", "drftghjklm"));

        RecyclerView listViewComments = findViewById(R.id.recyclerViewComments);

        CommentAdapter adapter = new CommentAdapter();
        adapter.setRecyclerViewManager(this);
        listViewComments.setAdapter(adapter);
        listViewComments.setLayoutManager(new LinearLayoutManager(this));

        */


        setContentView(R.layout.category_activity);

        listCategories.add(new Category("Humour"));
        listCategories.add(new Category("Film d'horreur"));

        RecyclerView listViewCategories = findViewById(R.id.recyclerViewCategories);

        CategoryAdapter adapter = new CategoryAdapter();
        adapter.setRecyclerViewManager(this);
        listViewCategories.setAdapter(adapter);
        listViewCategories.setLayoutManager(new LinearLayoutManager(this));




        /*
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
*/
        ImageButton close = findViewById(R.id.close);
        TextView headerBack = findViewById(R.id.headerBack);
        Button share = findViewById(R.id.share);
        final Button like = findViewById(R.id.like);
        Button comment = findViewById(R.id.comment);
        ImageButton send = findViewById(R.id.send);
        final EditText champText = findViewById(R.id.champtext);
        // Fermer l'appli

        close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });
        headerBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

        /*
        //like et dislike
        like.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            public void onClick(View v) {

                //cas ou on aime déja
                if(like.getCurrentTextColor() == getResources().getColor( R.color.my_blue ) ){
                    like.setBackground(getResources().getDrawable(R.drawable.button));
                    like.setTextColor(getResources().getColor( R.color.my_white ));
                    like.setCompoundDrawablesWithIntrinsicBounds( R.drawable.like, 0, 0, 0);
                }
                else{
                    like.setBackground(getResources().getDrawable(R.drawable.buttonlike));
                    like.setTextColor(getResources().getColor( R.color.my_blue ));
                    like.setCompoundDrawablesWithIntrinsicBounds( R.drawable.likeblue, 0, 0, 0);
                }
            }
        });
*/
        //Je n'ai pas compris la signification de "rester focus"..

        //popup à l'envoi
/*
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setMessage(champText.getText());
                champText.setText("");
                AlertDialog popUp = builder.create();
                popUp.show();
            }
        });
*/
    }


    @Override
    public ArrayList<Entity> getEntities() {

        //return listComments;
        return listCategories;
    }

    @Override
    public int getNumberOfEntities() {
        //return listComments.size();
        return listCategories.size();
    }
}
