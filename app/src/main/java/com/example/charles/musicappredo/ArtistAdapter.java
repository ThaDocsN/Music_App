package com.example.charles.musicappredo;

        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;
        import java.util.List;
        import java.util.Objects;

public class ArtistAdapter extends ArrayAdapter<ArtistInfo> {

    public ArtistAdapter(@NonNull Context context, @NonNull List<ArtistInfo> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.content_artist_info, parent, false);
        }
        ArtistInfo currentArtist = getItem(position);

        TextView tvArtistName = listItemView.findViewById(R.id.artist_name);
        tvArtistName.setText(Objects.requireNonNull(currentArtist).getArtistName());
        TextView tvArtistSong = listItemView.findViewById(R.id.artist_song);
        tvArtistSong.setText(currentArtist.getArtistSong());
        return listItemView;
    }
}
