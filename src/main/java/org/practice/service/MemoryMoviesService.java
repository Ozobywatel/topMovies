package org.practice.service;

import org.practice.Movie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoryMoviesService implements MoviesService {

    private List<Movie> list;

    public MemoryMoviesService() {
        list = new ArrayList<>();
        list.add(new Movie("The Shawshank Redemption", "PT142M", List.of("Tim Robbins", "Morgan Freeman", "Bob Gunton"),
                List.of(), new ArrayList<>(Arrays.asList(66380, 7001, 9250, 34139)), new ArrayList<>(Arrays.asList(15291, 51417, 62289, 6146, 71389, 93707))));
        list.add(new Movie("The Godfather", "PT175M", List.of("Marlon Brando", "Al Pacino", "James Caan"),
                List.of(), new ArrayList<>(Arrays.asList(15291, 51417, 7001, 9250, 71389, 93707)), new ArrayList<>(Arrays.asList(62289, 66380, 34139, 6146))));
        list.add(new Movie("The Dark Knight", "PT152M", List.of("Christian Bale", "Heath Ledger", "Aaron Eckhart"),
                List.of(), new ArrayList<>(Arrays.asList(15291, 7001, 9250, 34139, 93707)), new ArrayList<>(Arrays.asList(51417, 62289, 6146, 71389))));
        list.add(new Movie("Pulp Fiction", "PT154M", List.of("John Travolta", "Uma Thurman", "Samuel L. Jackson"),
                List.of(), new ArrayList<>(Arrays.asList(15291, 51417, 62289, 66380, 71389, 93707)), new ArrayList<>(Arrays.asList(7001, 9250, 34139, 6146))));
        list.add(new Movie("Schindler's List", "PT195M", List.of("Liam Neeson", "Ralph Fiennes", "Ben Kingsley"),
                List.of(), new ArrayList<>(Arrays.asList(62289, 66380, 6146, 71389)), new ArrayList<>(Arrays.asList(15291, 51417, 7001, 9250, 93707))));
    }

    public List<Movie> getmList() {
        return list;
    }

    public void setmList(List<Movie> list) {
        this.list = list;
    }



}
