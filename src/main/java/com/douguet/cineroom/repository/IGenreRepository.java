package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Genre;

@Repository
public interface IGenreRepository extends JpaRepository<Genre, Integer> {

}