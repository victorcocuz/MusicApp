package com.example.android.musicapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent goToDiscover = new Intent(MainActivity.this, Discover.class);
                startActivity(goToDiscover);
            }
            });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent goToPlaylists = new Intent(MainActivity.this, Playlists.class);
                startActivity(goToPlaylists);
            }
            });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent goToLibrary = new Intent(MainActivity.this, Library.class);
                startActivity(goToLibrary);
            }
            });


        }

    }
