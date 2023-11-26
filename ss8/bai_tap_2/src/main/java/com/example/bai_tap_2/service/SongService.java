package com.example.bai_tap_2.service;

import com.example.bai_tap_2.model.Song;
import com.example.bai_tap_2.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository songRepository;
    @Override
    public void addNewSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public List<Song> getAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(int id) {
        Song song =  songRepository.findById(id).get();
        return song;
    }
}
