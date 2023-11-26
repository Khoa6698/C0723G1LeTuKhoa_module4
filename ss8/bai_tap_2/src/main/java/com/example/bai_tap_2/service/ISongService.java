package com.example.bai_tap_2.service;

import com.example.bai_tap_2.model.Song;

import java.util.List;

public interface ISongService {
    void addNewSong(Song song);
    List<Song> getAll();

    Song findById(int id);
}
