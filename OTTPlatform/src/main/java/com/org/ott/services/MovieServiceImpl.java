package com.org.ott.services;

import com.org.ott.entity.Movie;
import com.org.ott.entity.User;
import com.org.ott.repository.MovieRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Data
@Service
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository = null;

    @Override
    public Movie createMovie(Movie movie, String email) {
        if (email.equals("mastersoumik2003@gmail.com")) {
            movie.setReleaseData(new Date());
            return movieRepository.save(movie);
        }
        return null;
    }

    @Override
    public Movie updateMovie(Movie movie, String email) {
        Movie currentMovie = movieRepository.findById(movie.getId()).orElseThrow();
        if (email.equals("mastersoumik2003@gmail.com")) {
            currentMovie.setName(movie.getName());
            currentMovie.setRating(movie.getRating());
            currentMovie.setImage(movie.getImage());
            currentMovie.setReleaseData(movie.getReleaseData());
            movieRepository.save(currentMovie);
            return currentMovie;
        }
        return null;
    }

    @Override
    public boolean deleteMovie(Integer id,String email) {
        if (email.equals("mastersoumik2003@gmail.com")) {
            Movie currentMovie = movieRepository.findById(id).orElseThrow();
            movieRepository.delete(currentMovie);
            return true;
        }
        return false;
    }

    @Override
    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }
}
