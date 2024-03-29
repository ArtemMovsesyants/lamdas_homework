package com.movsesyants.chapter3.exercise;

import com.movsesyants.chapter3.Album;
import com.movsesyants.chapter3.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, integer) -> acc + integer);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream().map(artist -> artist.getName() + " " + artist.getNationality())
                .collect(Collectors.toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {

        return input.stream().filter(album -> album.getTracks().count() <= 3).collect(Collectors.toList());
    }
}
