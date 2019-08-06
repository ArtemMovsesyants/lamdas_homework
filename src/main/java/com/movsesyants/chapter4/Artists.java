package com.movsesyants.chapter4;


import com.movsesyants.chapter3.Artist;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        Optional<Artist> artist;
        if (index < 0 || index >= artists.size()) {
            artist = Optional.empty();
        } else {
            artist = Optional.of(artists.get(index));
        }
        return artist;
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        if (artist.isPresent()) {
            return artist.get().getName();
        } else {
            return "Default Name";
        }

    }

}
