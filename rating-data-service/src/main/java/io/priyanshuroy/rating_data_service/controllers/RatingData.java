package io.priyanshuroy.rating_data_service.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.priyanshuroy.rating_data_service.models.Rating;

@RestController
@RequestMapping("/api/v1/rating-data")

    public class RatingData {
        @RequestMapping("/{movieId}")
        public Rating getRating(@PathVariable("movieId") String movieId) {
            return new Rating(movieId, 4.5);
        }
    }
