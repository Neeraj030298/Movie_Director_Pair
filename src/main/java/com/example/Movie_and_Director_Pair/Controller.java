package com.example.Movie_and_Director_Pair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Movie")
public class Controller {
    @Autowired
    Movie_Service movie_service;
    @PostMapping("/addMoviePair")
 public void addMovie(@RequestBody() Movie_entity m, @RequestParam("Director") String director)
    {
 movie_service.add_Movie_Director_Pair(m, director);
    }

    @GetMapping("/get-movies")
    public List<Movie_entity> getMovies(@RequestParam("Director") String director)
    {
  return movie_service.get_Movie_By_Director_Name(director);
    }
}
