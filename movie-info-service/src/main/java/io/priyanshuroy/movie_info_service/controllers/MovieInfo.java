package io.priyanshuroy.movie_info_service.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.priyanshuroy.movie_info_service.models.Movie;

@RestController
@RequestMapping("/api/v1/movie-info")
public class MovieInfo {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Sample Movie");
    }
}
