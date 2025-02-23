package com.douguet.cineroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.douguet.cineroom.entity.Utilisateur;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}