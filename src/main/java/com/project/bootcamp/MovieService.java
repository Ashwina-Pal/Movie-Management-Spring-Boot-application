package com.project.bootcamp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

    List<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie(1, "Interstellar", "Sci-Fi"));
        movies.add(new Movie(2, "Avengers", "Action"));
        movies.add(new Movie(3, "Inception", "Thriller"));
    }
    
    public List<Movie> getMovie() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}
