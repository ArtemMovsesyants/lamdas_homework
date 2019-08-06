package com.movsesyants.chapter3.exercise;

import com.movsesyants.chapter3.Artist;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

    public static void task(){
        Artist artist1 = new Artist("Artist1", "City1");
        Artist artist2 = new Artist("Artist2", "City2");
        Artist artist3 = new Artist("Artist3", "City3");

        List<Artist> members = new ArrayList<>();
        members.add(artist1);
        members.add(artist2);
        members.add(artist3);

        artist1.setMembers(members);
        artist2.setMembers(members);
        artist3.setMembers(members);

        List<Artist> artistList = new ArrayList<>();
        artistList.add(artist1);
        artistList.add(artist2);
        artistList.add(artist3);

        long count = artistList.stream().flatMap(artist -> artist.getMembers()).count();
        System.out.println(count);
    }

}
