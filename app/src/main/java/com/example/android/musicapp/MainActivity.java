package com.example.android.musicapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button IcLibrary = (Button) findViewById(R.id.main_login);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(MainActivity.this, PlayingNow.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(MainActivity.this, "This is a playlist based music app that will play songs of a certain type in anti-chronological order. The login activity will check the user name and password in a database on a server. The artwork of the current song will always be displayed as a blurred background", Toast.LENGTH_LONG).show();


    }

}
