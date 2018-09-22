package com.example.calvi.tp1.activities;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.calvi.tp1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                builder.setMessage(champText.getText());
                champText.setText("");
                AlertDialog popUp = builder.create();
                popUp.show();
            }
        });
    }




}