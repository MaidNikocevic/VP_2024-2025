package mk.ukim.finki.wp.lab.service.impl;

import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.exceptions.AlbumNotFoundException;
import mk.ukim.finki.wp.lab.repository.AlbumRepository;
import mk.ukim.finki.wp.lab.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImplementation implements AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumServiceImplementation(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return this.albumRepository.findAll();
    }

    @Override
    public Album findByAlbumId(Long albumId) {
        Album album = this.albumRepository.findAlbumById(albumId).orElse(null);
        if (album == null) {
            throw new AlbumNotFoundException(albumId);
        } else {
            return album;
        }
    }
}