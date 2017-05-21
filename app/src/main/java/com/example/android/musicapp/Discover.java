package com.example.android.musicapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.android.musicapp.R.layout.activity_discover;

public class Discover extends AppCompatActivity {

    String[] playlist_title;
    String[] playlist_subtitle;
    int[] playlist_img = {R.drawable.playlist_1, R.drawable.playlist_2, R.drawable.playlist_3, R.drawable.playlist_4, R.drawable.playlist_5, R.drawable.playlist_6, R.drawable.playlist_7, R.drawable.playlist_8, R.drawable.playlist_9, R.drawable.playlist_10, R.drawable.playlist_11, R.drawable.playlist_12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_discover);

        Resources res = getResources();
        playlist_title = res.getStringArray(R.array.playlist_title);
        playlist_subtitle=res.getStringArray(R.array.playlist_subtitle);

        ListAdapter discoverList = new PlaylistAdapter(this, playlist_img, playlist_title, playlist_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.discover_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String discover = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Discover.this, discover, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
