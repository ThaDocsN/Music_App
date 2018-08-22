package com.example.charles.musicappredo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_list_view);
        Button btHipHop = findViewById(R.id.btHipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CountryActivity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.btRB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CountryActivity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.btReggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CountryActivity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.btCountry);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(CountryActivity.this, CountryActivity.class));
            }
        });
        String stParton = getString(R.string.artist_dolly);
        String stPartonSong = getString(R.string.artist_song_dolly);
        String stWillie = getString(R.string.artist_willie);
        String stWillieSong = getString(R.string.artist_song_willie);
        String stHank = getString(R.string.artist_hank);
        String stHankSong = getString(R.string.artist_song_hank);

        final ArrayList<ArtistInfo> artists = new ArrayList<ArtistInfo>();
        artists.add(new ArtistInfo(stParton, stPartonSong));
        artists.add(new ArtistInfo(stWillie, stWillieSong));
        artists.add(new ArtistInfo(stHank, stHankSong));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArtistInfo selectedArtist = artists.get(position);
                Intent detailsIntent = new Intent(CountryActivity.this, NowPlayingActivity.class);
                detailsIntent.putExtra("artistName", selectedArtist.getArtistName());
                detailsIntent.putExtra("artistSong", selectedArtist.getArtistSong());
                startActivity(detailsIntent);
            }
        });
    }
}
