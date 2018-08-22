package com.example.charles.musicappredo;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import java.util.Objects;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Button btHipHop = findViewById(R.id.hipHop);
        btHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(NowPlayingActivity.this, HipHopActivity.class));
            }
        });
        Button btRB = findViewById(R.id.rB);
        btRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(NowPlayingActivity.this, RB_Activity.class));
            }
        });
        Button btReggae = findViewById(R.id.reggae);
        btReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(NowPlayingActivity.this, ReggaeActivity.class));
            }
        });
        Button btCountry = findViewById(R.id.country);
        btCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(NowPlayingActivity.this, CountryActivity.class));
            }
        });
        String artistName, artistSong;
        artistName = Objects.requireNonNull(this.getIntent().getExtras()).getString("artistName");
        TextView tvArtist = findViewById(R.id.artist);
        tvArtist.setText(artistName);
        artistSong = this.getIntent().getExtras().getString("artistSong");
        TextView tvArtistInfo = findViewById(R.id.song);
        tvArtistInfo.setText(artistSong);
    }
}
