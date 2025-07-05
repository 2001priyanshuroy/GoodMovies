package io.priyanshuroy.movie_catalog_service.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.priyanshuroy.movie_catalog_service.models.Movie;

@RestController
@RequestMapping("/api/v1/catalog")
public class MovieCatalog {
    @GetMapping("/{userId}")
    public List<Movie> getMovieById(@PathVariable("userId") String userId) {
        return Collections.singletonList(new Movie("Inception", "A mind-bending thriller", 9));

    }
}
