package com.twu.biblioteca;

public class Movie implements Item {

    private String name, director;
    private int year;
    private float movieRating;

    Movie(String name, int year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-8s | %-20s | %s", name, year, director, movieRating);
    }

    @Override
    public String getItemName() {
        return name;
    }
}
