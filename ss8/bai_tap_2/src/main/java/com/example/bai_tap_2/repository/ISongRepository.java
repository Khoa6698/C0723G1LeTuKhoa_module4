package com.example.bai_tap_2.repository;

import com.example.bai_tap_2.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {

}
