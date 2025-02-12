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
@Table(name = "film_genre")
public class FilmGenre {

    @Id
    @ManyToOne
    @MapsId("idFilm")
    @JoinColumn(name = "id_film", referencedColumnName = "id_film", nullable = false)
    private Film film;

    @Id
    @ManyToOne
    @MapsId("idGenre")
    @JoinColumn(name = "id_genre", referencedColumnName = "id_genre", nullable = false)
    private Genre genre;

}