package com.example.charles.musicappredo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_view);
        Button btHipHop = findViewById(R.id.btHipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HipHopActivity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.btRB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HipHopActivity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.btReggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HipHopActivity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.btCountry);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HipHopActivity.this, CountryActivity.class));
            }
        });
        String stTupac = getString(R.string.artist_tupac);
        String stTupacSong = getString(R.string.artist_song_tupac);
        String stIceCube = getString(R.string.artist_ice_cube);
        String stIceCubeSong = getString(R.string.artist_song_cube);
        String stSnoop = getString(R.string.artist_snoop);
        String stSnoopSong = getString(R.string.artist_song_snoop);

        final ArrayList<ArtistInfo> artists = new ArrayList<ArtistInfo>();
        artists.add(new ArtistInfo(stTupac, stTupacSong));
        artists.add(new ArtistInfo(stIceCube, stIceCubeSong));
        artists.add(new ArtistInfo(stSnoop, stSnoopSong));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArtistInfo selectedArtist = artists.get(position);
                Intent detailsIntent = new Intent(HipHopActivity.this, NowPlayingActivity.class);
                detailsIntent.putExtra("artistName", selectedArtist.getArtistName());
                detailsIntent.putExtra("artistSong", selectedArtist.getArtistSong());
                startActivity(detailsIntent);
            }
        });
    }
}
