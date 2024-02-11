package com.org.ott.controller;


import com.org.ott.entity.Movie;
import com.org.ott.entity.User;
import com.org.ott.services.MovieService;
import com.org.ott.services.UserService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("movies")
public class MovieController {


    private final MovieService movieService = null;

    //! http://localhost:8082/movies/{email}
    @PostMapping("{email}")
    public ResponseEntity<Movie> createMovie(
            @RequestBody Movie movie,
            @PathVariable String email
    ) {
        return new ResponseEntity<>(movieService.createMovie(movie, email), HttpStatus.CREATED);
    }

    @PutMapping("{email}")
    public ResponseEntity<Movie> updateMovie(
            @RequestBody Movie movie,
            @PathVariable String email
    ) {
        return ResponseEntity.ok(movieService.updateMovie(movie,email));
    }

    @DeleteMapping("{email}/{id}")
    public ResponseEntity<String> deleteMovie(
            @PathVariable String email,
            @PathVariable String id
    ) {
        if (movieService.deleteMovie(Integer.parseInt(id), email)) {
            return new ResponseEntity<>("User deleted successfully!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Error in deletion.", HttpStatus.OK);
    }

    //! http://localhost:8082/movies
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovie());
    }
}
