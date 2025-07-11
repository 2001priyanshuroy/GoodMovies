package io.priyanshuroy.movie_catalog_service.models;

public class Movie {

    private String name;
    private String description;
    private int rating;

    public Movie(String name, String description, int rating) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }  

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }   

}
