package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.PersonnaliteFilm;

@Repository
public interface IPersonnaliteFilmRepository extends JpaRepository<PersonnaliteFilm, Integer> {

}