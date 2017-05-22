package com.bogdanorzea.bluemusicplayer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryFragment extends Fragment {


    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);

        // TODO Add some artists here
        final ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Rihanna");
        artistList.add("Justin Timberlake");
        artistList.add("Michael Jackson");
        artistList.add("Rita Ora");
        artistList.add("Maroon 5");
        artistList.add("Eminem");
        artistList.add("2Pac");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, artistList);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // TODO PUT INTENT TO OPEN SONG IN THE NOW PLAYING SECTION
                Toast.makeText(view.getContext(), artistList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

}
