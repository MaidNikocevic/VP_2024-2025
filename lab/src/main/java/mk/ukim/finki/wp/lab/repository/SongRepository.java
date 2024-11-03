package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class SongRepository {

    public List<Song> findAll() {
        return DataHolder.songList;
    }
    public Song findByTrackId(String trackId) {
    return DataHolder.songList.stream().filter(songs -> songs.getTrackId().equals(trackId)).findFirst().orElse(null);
    }
    public Artist addArtistToSong(Artist artist, Song song){
        for (Song s : DataHolder.songList) {
            if (s.getTrackId().equals(song.getTrackId())) {
                s.addPerformer(artist);
                return artist;
            }
        }
        return null;
    }
}
