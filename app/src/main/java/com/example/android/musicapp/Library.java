package com.example.android.musicapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Library extends AppCompatActivity {

    String[] library_title;
    String[] library_subtitle;
    int[] library_img = {R.drawable.album_1, R.drawable.album_2, R.drawable.album_3, R.drawable.album_4, R.drawable.album_5, R.drawable.album_6, R.drawable.album_7, R.drawable.album_8, R.drawable.album_9, R.drawable.album_10, R.drawable.album_11, R.drawable.album_12};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.library_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(Library.this, Discover.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.library_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(Library.this, Playlists.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.library_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(Library.this, Library.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.library_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(Library.this, PlayingNow.class);
                startActivity(goToPlayingNow);
            }
        });

        Resources res = getResources();
        library_title = res.getStringArray(R.array.library_title);
        library_subtitle = res.getStringArray(R.array.library_subtitle);

        ListAdapter discoverList = new PlaylistAdapter(this, library_img, library_title, library_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.library_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent goToPlayingNow = new Intent(Library.this, PlayingNow.class);
                        startActivity(goToPlayingNow);
                    }
                });
    }
}
