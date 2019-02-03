package com.example.oliverh.jokedisplayer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class NewJoker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newjoke);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String newJokeString = getIntent().getStringExtra(getString(R.string.newJokeKey));
        TextView jokeTv = findViewById(R.id.tv_newJoke);
        jokeTv.setText(newJokeString);
    }
}
