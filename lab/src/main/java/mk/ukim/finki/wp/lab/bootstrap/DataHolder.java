package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songList = new ArrayList<>();

    @PostConstruct
    public void init() {
        artistList.add(new Artist(1L, "Liam", "Payne", "Singer and compositor"));
        artistList.add(new Artist(2L, "Harry", "Styles", "1D member"));
        artistList.add(new Artist(3L, "Mihajlo", "Veruovic", "Serbian singer"));
        artistList.add(new Artist(4L, "Declan ", "Patrick", "English singer, songwriter, record producer"));
        artistList.add(new Artist(5L, "Edward", "Sheeran ", " Singer-songwriter"));

        songList.add(new Song("Song1", "Best of luck", "Rock", 1994));
        songList.add(new Song("Song2", "You know", "Techno", 1990));
        songList.add(new Song("Song3", "Enjoy", "Pop", 1991));
        songList.add(new Song("Song4", "Nevermind", "Jazz", 1999));
        songList.add(new Song("Song5", "Party ", "Hip-Hop", 2003));
    }
}