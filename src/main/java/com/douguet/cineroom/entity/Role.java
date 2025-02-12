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
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "nom", nullable = false, length = 255, unique = true)
    private String nom;

    @Column(name = "description", length = 255)
    private String description;

    // OneToMany relationship with Utilisateur
    @OneToMany(mappedBy = "role")
    private List<Utilisateur> utilisateurs;
}
