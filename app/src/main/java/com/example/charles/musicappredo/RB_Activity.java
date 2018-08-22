package com.example.charles.musicappredo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RB_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_view);

        Button btHipHop = findViewById(R.id.btHipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RB_Activity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.btRB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RB_Activity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.btReggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RB_Activity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.btCountry);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RB_Activity.this, CountryActivity.class));
            }
        });
        String stKelly = getString(R.string.artist_kelly);
        String stKellySong = getString(R.string.artist_song_kelly);
        String stGuy = getString(R.string.artist_guy);
        String stGuySong = getString(R.string.artist_song_guy);
        String stBlige = getString(R.string.artist_mary);
        String stBligeSong = getString(R.string.artist_song_mary);

        final ArrayList<ArtistInfo> artists = new ArrayList<ArtistInfo>();
        artists.add(new ArtistInfo(stKelly, stKellySong));
        artists.add(new ArtistInfo(stGuy, stGuySong));
        artists.add(new ArtistInfo(stBlige, stBligeSong));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArtistInfo selectedArtist = artists.get(position);
                Intent detailsIntent = new Intent(RB_Activity.this, NowPlayingActivity.class);
                detailsIntent.putExtra("artistName", selectedArtist.getArtistName());
                detailsIntent.putExtra("artistSong", selectedArtist.getArtistSong());
                startActivity(detailsIntent);
            }
        });
    }
}
