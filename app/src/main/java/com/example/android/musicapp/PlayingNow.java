package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayingNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_now);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.playingnow_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(PlayingNow.this, Discover.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.playingnow_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(PlayingNow.this, Playlists.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.playingnow_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(PlayingNow.this, Library.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.playingnow_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(PlayingNow.this, PlayingNow.class);
                startActivity(goToPlayingNow);
            }
        });

    }
}
