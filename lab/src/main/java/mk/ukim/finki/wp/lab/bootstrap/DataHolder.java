package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Album> albums = new ArrayList<>();

    @PostConstruct
    public void init() {
        artistList=new ArrayList<>();
        artistList.add(new Artist(1L, "Liam", "Payne", "Singer and compositor"));
        artistList.add(new Artist(2L, "Harry", "Styles", "1D member"));
        artistList.add(new Artist(3L, "Mihajlo", "Veruovic", "Serbian singer"));
        artistList.add(new Artist(4L, "Declan ", "Patrick", "English singer, songwriter, record producer"));
        artistList.add(new Artist(5L, "Edward", "Sheeran ", " Singer-songwriter"));


        albums = new ArrayList<>();
        albums.add(new Album("Album1", "Pop rock", "1969"));
        albums.add(new Album("Album2", "Rock", "2004"));
        albums.add(new Album("Album3", "Alternative Rock", "1997"));
        albums.add(new Album("Album4", "Alternative/Idile", "1999"));
        albums.add(new Album("Album5", "Soft Rock", "1983"));

        songs = new ArrayList<>();
        songs.add(new Song("Song1", "Best of luck", 1994,  new ArrayList<>(List.of(artistList.get(0))), albums.get(1)));
        songs.add(new Song("Song2", "You know", 1993, new ArrayList<>(List.of(artistList.get(1))), albums.get(3)));
        songs.add(new Song("Song3", "Enjoy", 1993, new ArrayList<>(List.of(artistList.get(2))), albums.get(1)));
        songs.add(new Song("Song4", "Nevermind", 1955, new ArrayList<>(List.of(artistList.get(2))), albums.get(2)));
        songs.add(new Song("Song5", "Party ", 1999, new ArrayList<>(List.of(artistList.get(4))), albums.get(1)));

    }
}