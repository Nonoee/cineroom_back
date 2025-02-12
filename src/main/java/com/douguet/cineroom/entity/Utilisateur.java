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
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Integer idUtilisateur;

    @Column(name = "prenom", nullable = false, length = 100)
    private String prenom;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "pays", length = 100)
    private String pays;

    @Column(name = "telephone", nullable = false, length = 20)
    private String telephone;

    @Column(name = "enable_fa", nullable = false)
    private Boolean enableFa;

    @Column(name = "date_creation", nullable = false)
    private java.util.Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "id_role", nullable = false)
    private Role role;

    // OneToMany relationship with Avis
    @OneToMany(mappedBy = "utilisateur")
    private List<Avis> avis;

    // OneToMany relationship with Playlist
    @OneToMany(mappedBy = "utilisateur")
    private List<Playlist> playlists;

    // ManyToMany relationship with Film (via utilisateur_film)
    @ManyToMany
    @JoinTable(
      name = "utilisateur_film", 
      joinColumns = @JoinColumn(name = "id_utilisateur"), 
      inverseJoinColumns = @JoinColumn(name = "id_film"))
    private List<Film> films;
}
