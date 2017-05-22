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

import static com.example.android.musicapp.R.layout.activity_playlists;

public class Playlists extends AppCompatActivity {

    String[] playlists_title;
    String[] playlists_subtitle;
    int[] playlists_img = {R.drawable.playlist_1, R.drawable.playlist_2, R.drawable.playlist_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_playlists);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.playlists_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(Playlists.this, Discover.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.playlists_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(Playlists.this, Playlists.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.playlists_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(Playlists.this, Library.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.playlists_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(Playlists.this, PlayingNow.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(Playlists.this, "The user can create his own playlist by mix and matching the songs in his library. All playlists are publicly shared", Toast.LENGTH_LONG).show();

        Resources res = getResources();
        playlists_title = res.getStringArray(R.array.playlists_title);
        playlists_subtitle = res.getStringArray(R.array.playlists_subtitle);

        ListAdapter discoverList = new PlaylistAdapter(this, playlists_img, playlists_title, playlists_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.playlists_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent goToPlayingNow = new Intent(Playlists.this, PlayingNow.class);
                        startActivity(goToPlayingNow);
                    }
                });
    }
}
