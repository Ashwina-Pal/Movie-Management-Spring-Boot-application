package com.project.bootcamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/getMovie")
    public List<Movie> getMovie() {
        return service.getMovie();
    }

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody Movie movie) {
        service.addMovie(movie);
    }
}
