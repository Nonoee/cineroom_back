package com.douguet.cineroom.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "utilisateur_film")
public class UtilisateurFilm {

	@EmbeddedId
    private UtilisateurFilmPK id;
	
    @ManyToOne
    @MapsId("idUtilisateur")
    @JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne
    @MapsId("idFilm")
    @JoinColumn(name = "id_film", referencedColumnName = "id_film", nullable = false)
    private Film film;

    @Column(name = "favori", nullable = false)
    private boolean favori;

    @Column(name = "visionne", nullable = false)
    private boolean visionne;
	
}
