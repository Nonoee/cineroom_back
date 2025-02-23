package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Personnalite;

@Repository
public interface IPersonnaliteRepository extends JpaRepository<Personnalite, Integer> {

}