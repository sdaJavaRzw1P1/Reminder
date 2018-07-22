package pl.sda;

import java.util.Arrays;
import java.util.List;

public class Album {

    String name;
    List<Track> tracks;

    public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album " +
                "name:'" + name + '\'' +
                ", tracks:" + Arrays.toString(tracks.toArray());
    }
}
