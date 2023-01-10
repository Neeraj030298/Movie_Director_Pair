package com.example.Movie_and_Director_Pair;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movies")
public class Movie_entity {
    @Id
    @Column(name = "Movie")
    private String movie_name;
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    @Column(name = "Director")
    private String director_Name;


}
