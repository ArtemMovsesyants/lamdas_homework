package com.movsesyants.chapter3.exercise;

import com.movsesyants.chapter3.Album;
import com.movsesyants.chapter3.Artist;
import com.movsesyants.chapter3.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static void taskA() {
        System.out.println(Question1.addUp(Stream.of(1, 2, 3, 4)));
    }

    private static void taskB() {
        Artist artist1 = new Artist("Artist1", "City1");
        Artist artist2 = new Artist("Artist2", "City2");
        Artist artist3 = new Artist("Artist3", "City3");

        List<Artist> artistList = new ArrayList<>();
        artistList.add(artist1);
        artistList.add(artist2);
        artistList.add(artist3);

        System.out.println(Question1.getNamesAndOrigins(artistList));
    }

    private static void taskC() {
        Track track = new Track("a", 1);

        List<Track> trackList1 = new ArrayList<>();
        trackList1.add(track);

        List<Track> trackList2 = new ArrayList<>();
        trackList2.add(track);
        trackList2.add(track);
        trackList2.add(track);

        List<Track> trackList3 = new ArrayList<>();
        trackList3.add(track);
        trackList3.add(track);
        trackList3.add(track);
        trackList3.add(track);

        Album album1 = new Album("Album1", trackList1, new ArrayList<>());
        Album album2 = new Album("Album2", trackList2, new ArrayList<>());
        Album album3 = new Album("Album3", trackList3, new ArrayList<>());

        List<Album> albumList = new ArrayList<>();
        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);

        System.out.println(Question1.getAlbumsWithAtMostThreeTracks(albumList));
    }

    public static void main(String[] args) {

        Question2.task();

    }
}
