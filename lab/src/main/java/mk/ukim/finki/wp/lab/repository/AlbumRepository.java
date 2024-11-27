package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository {
    public List<Album> findAll() {
        return DataHolder.albums;
    }

    public Optional<Album> findAlbumById(Long id) {
        return DataHolder.albums.stream().filter(album -> album.getId().equals(id)).findFirst();
    }
}