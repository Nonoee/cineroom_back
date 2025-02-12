package com.douguet.cineroom.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "personnalite_film")
public class PersonnaliteFilm {

    @Id
    @ManyToOne
    @MapsId("idFilm")
    @JoinColumn(name = "id_film", referencedColumnName = "id_film", nullable = false)
    private Film film;

    @Id
    @ManyToOne
    @MapsId("idPersonnalite")
    @JoinColumn(name = "id_personnalite", referencedColumnName = "id_personnalite", nullable = false)
    private Personnalite personnalite;

    @Column(name = "nom_personne", nullable = false)
    private String nomPersonne;

}