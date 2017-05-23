package com.bogdanorzea.bluemusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // TODO Add some artists here
        final ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Rihanna - Umbrella");
        artistList.add("Justin Timberlake - Cry me a river");
        artistList.add("Michael Jackson - Man in the mirror");
        artistList.add("Rita Ora - Never let me down");
        artistList.add("Maroon 5 - Sugar");
        artistList.add("Eminem - Cleaning out my closet");
        artistList.add("2Pac - Hail Marry");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, artistList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // TODO PUT INTENT TO OPEN SONG IN THE NOW PLAYING SECTION
                Toast.makeText(view.getContext(), artistList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
