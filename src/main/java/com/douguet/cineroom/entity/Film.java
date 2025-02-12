package com.douguet.cineroom.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
@Table(name = "Film")
public class Film {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_film")
    private Integer idFilm;

    @Column(name = "id_tmdb", nullable = false, length = 10)
    private String idTmdb;

    @Column(name = "titre", nullable = false, length = 255)
    private String titre;

    @Column(name = "jaquette", length = 255)
    private String jaquette;

    @Column(name = "date_sortie")
    private LocalDate dateSortie;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "url_film", length = 255)
    private String urlFilm;

    @Column(name = "date_ajout", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAjout;

    // OneToMany relationship with Avis
    @OneToMany(mappedBy = "film")
    private List<Avis> avis;
    
    // ManyToMany relationship with Genre
    @ManyToMany
    @JoinTable(
        name = "film_genre",
        joinColumns = @JoinColumn(name = "id_film"),
        inverseJoinColumns = @JoinColumn(name = "id_genre")
    )
    private List<Genre> genres;
    
    @ManyToOne
    @JoinColumn(name = "id_personnalite")
    private Personnalite personnalite;
}
