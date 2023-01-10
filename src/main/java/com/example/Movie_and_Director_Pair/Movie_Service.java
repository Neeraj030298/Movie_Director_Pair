package com.example.Movie_and_Director_Pair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Movie_Service {
    @Autowired
    Movie_Repo movie_repo;
    @Autowired
    Director_Repo director_repo;
    public void add_Movie_Director_Pair(Movie_entity movie, String director)
    {

       movie.setDirector_Name(director);
       movie_repo.save(movie);
    }
    public List<Movie_entity> get_Movie_By_Director_Name(String DirectorName) {
        List<Movie_entity> me = new ArrayList<>();
        for (Movie_entity m1 : movie_repo.findAll()) {
            if (m1.getDirector_Name() == DirectorName) {
                me.add(m1);
            }
        }
            return me;

        }

}