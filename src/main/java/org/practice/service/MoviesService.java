package org.practice.service;

import org.practice.Movie;
import org.practice.User;

import java.util.List;
import java.util.Optional;

public interface MoviesService {

    List<Movie> moviesById(int id);

}
