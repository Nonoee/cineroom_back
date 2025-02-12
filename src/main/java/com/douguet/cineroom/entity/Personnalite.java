package com.douguet.cineroom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "personnalite")
public class Personnalite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personnalite")
    private Integer idPersonnalite;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @Column(name = "photo", length = 255)
    private String photo;

    @Column(name = "popularite")
    private Double popularite;

    @Column(name = "creation_date")
    private java.util.Date creationDate;

    @Column(name = "id_credit", length = 255)
    private String idCredit;

    // ManyToMany relationship with Film (through personnalite_film)
    @ManyToMany(mappedBy = "personnalite")
    private List<Film> films;
}
