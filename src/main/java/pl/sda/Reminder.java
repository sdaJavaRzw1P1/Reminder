package pl.sda;

import java.util.*;
import java.util.stream.Collectors;

public class Reminder {

    private static final List<Album> ALBUMS = Arrays.asList(
            new Album("Album 0", Arrays.asList(
                    new Track("Track 0.1", 3),
                    new Track("Track 0.2", 2),
                    new Track("Track 0.3", 2),
                    new Track("Track 0.4", 1),
                    new Track("Track 0.5", 1)
            )),
            new Album("Album 1", Arrays.asList(
                    new Track("Track 1.1", 3),
                    new Track("Track 1.2", 5),
                    new Track("Track 1.3", 6),
                    new Track("Track 1.4", 1),
                    new Track("Track 1.5", 4)
            )),
            new Album("Album 2", Arrays.asList(
                    new Track("Track 2.1", 1),
                    new Track("Track 2.2", 6),
                    new Track("Track 2.3", 3),
                    new Track("Track 2.4", 4),
                    new Track("Track 2.5", 4),
                    new Track("Track 2.6", 2)
            )),
            new Album("Album 3", Arrays.asList(
                    new Track("Track 3.1", 1),
                    new Track("Track 3.2", 2),
                    new Track("Track 3.3", 3)
            ))
    );


    public static void main(String[] args) {
        streamConvert();
        sortedSetConvert();
        connect(new ArrayList<>(Arrays.asList("asada", "cos", "tam")));
    }

    private static void streamConvert() {
        System.out.println("Input streamConvert: " + Arrays.toString(ALBUMS.toArray()));

        /*List<Album> favs = new ArrayList<>();
        for (Album a : ALBUMS) {
            boolean hasFavorite = false;
            for (Track t : a.tracks) {
                if (t.rating >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(a);
        }*/
        List<Album> favs = ALBUMS.stream().filter(album -> album.tracks.stream().anyMatch(tr -> (tr.rating > 4))).collect(Collectors.toList());

        Collections.sort(favs, (a1, a2) -> a1.name.compareTo(a2.name));

        System.out.println("Result streamConvert: " + Arrays.toString(favs.toArray()));
    }

    private static void sortedSetConvert() {
        List<String> args = Arrays.asList("x", "xxx", "xx", "x");
        Set<String> s = new TreeSet<>((o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() == o2.length()) {
                return 0;
            } else {
                return 1;
            }
        }
        );
        s.addAll(args);
        System.out.println("Result sortedSetConvert: " + s.size() + " distinct words: " + s);
    }

    private static String connect(List<String> list) {
        String nowy = list.stream().map(cos -> cos.trim().toUpperCase()).collect(Collectors.joining(" "));
        System.out.println(nowy);
        return nowy;
    }

}
