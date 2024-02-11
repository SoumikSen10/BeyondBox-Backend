package com.org.ott.services;

import com.org.ott.entity.Movie;

import java.util.List;

public interface MovieService {

    Movie createMovie(Movie movie, String email);
    Movie updateMovie(Movie movie, String email);
    boolean deleteMovie(Integer id, String email);

    List<Movie> getAllMovie();
}
