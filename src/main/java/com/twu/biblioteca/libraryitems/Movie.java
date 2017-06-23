package com.twu.biblioteca.libraryitems;

public class Movie implements Item {

    private String name, director;
    private int year;
    private float movieRating;

    public Movie(String name, int year, String director, int movieRating) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (year != movie.year) return false;
        if (Float.compare(movie.movieRating, movieRating) != 0) return false;
        if (!name.equals(movie.name)) return false;
        return director.equals(movie.director);
    }

}
