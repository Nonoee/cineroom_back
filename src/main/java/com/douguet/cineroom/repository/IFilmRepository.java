package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Film;

@Repository
public interface IFilmRepository extends JpaRepository<Film, Integer> {

}