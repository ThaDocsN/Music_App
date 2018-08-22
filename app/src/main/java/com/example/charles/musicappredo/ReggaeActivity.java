package com.example.charles.musicappredo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class ReggaeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_view);
        Button btHipHop = findViewById(R.id.btHipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ReggaeActivity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.btRB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ReggaeActivity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.btReggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ReggaeActivity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.btCountry);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ReggaeActivity.this, CountryActivity.class));
            }
        });

        String stBob = getString(R.string.artist_bob);
        String stBobSong = getString(R.string.artist_song_bob);
        String stSean = getString(R.string.artist_sean);
        String stSeanSong = getString(R.string.artist_song_sean);
        String stJimmy = getString(R.string.artist_jimmy);
        String stJimmySong = getString(R.string.artist_song_jimmy);

        final ArrayList<ArtistInfo> artists = new ArrayList<ArtistInfo>();
        artists.add(new ArtistInfo(stBob, stBobSong));
        artists.add(new ArtistInfo(stSean, stSeanSong));
        artists.add(new ArtistInfo(stJimmy, stJimmySong));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArtistInfo selectedArtist = artists.get(position);
                Intent detailsIntent = new Intent(ReggaeActivity.this, NowPlayingActivity.class);
                detailsIntent.putExtra("artistName", selectedArtist.getArtistName());
                detailsIntent.putExtra("artistSong", selectedArtist.getArtistSong());
                startActivity(detailsIntent);
            }
        });
    }
}
