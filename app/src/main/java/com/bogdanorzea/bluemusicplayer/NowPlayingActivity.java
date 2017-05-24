package com.bogdanorzea.bluemusicplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {
    TextView artistName;
    TextView songName;

    ImageButton previousButton;
    ImageButton rewindButton;
    ImageButton playButton;
    ImageButton forwardButton;
    ImageButton skipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        artistName = (TextView) findViewById(R.id.artist_name);
        songName = (TextView) findViewById(R.id.song_name);

        previousButton = (ImageButton) findViewById(R.id.previous);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Jump to previous song", Toast.LENGTH_SHORT).show();
            }
        });
        rewindButton = (ImageButton) findViewById(R.id.rewind);
        rewindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Rewind 5 seconds", Toast.LENGTH_SHORT).show();
            }
        });
        playButton = (ImageButton) findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Play/pause the sound", Toast.LENGTH_SHORT).show();
            }
        });
        forwardButton = (ImageButton) findViewById(R.id.forward);
        forwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Forward 5 seconds", Toast.LENGTH_SHORT).show();
            }
        });
        skipButton = (ImageButton) findViewById(R.id.skip);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Skip to next song", Toast.LENGTH_SHORT).show();
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("ARTIST&SONG");
            artistName = (TextView) findViewById(R.id.artist_name);
            songName = (TextView) findViewById(R.id.song_name);
            if (name != null) {
                String[] parts = name.split("-");
                if (parts.length == 2) {
                    artistName.setText(parts[0].trim());
                    songName.setText(parts[1].trim());
                }
            }
        }
    }
}
