package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.FilmGenre;

@Repository
public interface IFilmGenreRepository extends JpaRepository<FilmGenre, Integer> {

}