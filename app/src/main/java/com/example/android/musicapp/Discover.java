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

import static com.example.android.musicapp.R.layout.activity_discover;

public class Discover extends AppCompatActivity {

    String[] discover_title;
    String[] discover_subtitle;
    int[] discover_img = {R.drawable.discover_1, R.drawable.discover_2, R.drawable.discover_3, R.drawable.discover_4, R.drawable.discover_5, R.drawable.discover_6, R.drawable.discover_7, R.drawable.discover_8, R.drawable.discover_9, R.drawable.discover_10, R.drawable.discover_11, R.drawable.discover_12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_discover);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.discover_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(Discover.this, Discover.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.discover_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(Discover.this, Playlists.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.discover_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(Discover.this, Library.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.discover_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(Discover.this, PlayingNow.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(Discover.this, "The discover activity will connect the user via playlists created by other users. All playlists have music played anti-chronologically.", Toast.LENGTH_LONG).show();

        Resources res = getResources();
        discover_title = res.getStringArray(R.array.discover_title);
        discover_subtitle = res.getStringArray(R.array.discover_subtitle);

        ListAdapter discoverList = new PlaylistAdapter(this, discover_img, discover_title, discover_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.discover_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent goToPlayingNow = new Intent(Discover.this, PlayingNow.class);
                        startActivity(goToPlayingNow);
                    }
                });
    }
}
