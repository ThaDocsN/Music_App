package com.example.charles.musicappredo;

public class ArtistInfo {
    private String mArtistSong;
    private String mArtistName;

    public ArtistInfo(String Artist, String ArtistSong) {
        mArtistName = Artist;
        mArtistSong = ArtistSong;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getArtistSong() {
        return mArtistSong;
    }
}
