package com.example.calvi.tp1.activities;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.calvi.tp1.R;
import com.example.calvi.tp1.adapters.CommentAdapter;
import com.example.calvi.tp1.entities.Comment;
import com.example.calvi.tp1.interfaces.Entity;
import com.example.calvi.tp1.interfaces.RecyclerViewManager;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements RecyclerViewManager {

    private ArrayList<Entity> listComments = new ArrayList<Entity>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listComments.add(new Comment("Pierre", 1, "blablabla"));
        listComments.add(new Comment("Pierre", 2, "drftghjklm"));
        listComments.add(new Comment("Pierre", 1, "blablabla"));
        listComments.add(new Comment("Pierre", 2, "drftghjklm"));
        listComments.add(new Comment("Pierre", 1, "blablabla"));
        listComments.add(new Comment("Pierre", 2, "drftghjklm"));
        listComments.add(new Comment("Pierre", 1, "blablabla"));
        listComments.add(new Comment("Pierre", 2, "drftghjklm"));

        RecyclerView listViewComments = findViewById(R.id.recyclerViewComments);
        ViewCompat.setNestedScrollingEnabled(listViewComments, false);

        listViewComments.setNestedScrollingEnabled(true);
        final CommentAdapter commentAdapter = new CommentAdapter();
        commentAdapter.setRecyclerViewManager(this);
        listViewComments.setAdapter(commentAdapter);
        listViewComments.setLayoutManager(new LinearLayoutManager(this));



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

        //Je n'ai pas compris la signification de "rester focus"..

        //popup à l'envoi

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable commentText = champText.getText();
                listComments.add(new Comment("Pierre", 1, commentText.toString()));
                commentAdapter.notifyItemInserted(listComments.size()-1);

              
                /*
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setMessage(champText.getText());
                champText.setText("");
                AlertDialog popUp = builder.create();
                popUp.show();*/
            }
        });

    }


    @Override
    public ArrayList<Entity> getEntities() {

        return listComments;

    }

    @Override
    public int getNumberOfEntities() {
        return listComments.size();
    }
}
