package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Playlist;

@Repository
public interface IPlaylistRepository extends JpaRepository<Playlist, Integer> {

}