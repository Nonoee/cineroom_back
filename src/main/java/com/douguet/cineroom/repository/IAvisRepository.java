package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Avis;

@Repository
public interface IAvisRepository extends JpaRepository<Avis, Integer> {

}


