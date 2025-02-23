package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.UtilisateurFilm;

@Repository
public interface IUtilisateurFilmRepository extends JpaRepository<UtilisateurFilm, Integer> {

}