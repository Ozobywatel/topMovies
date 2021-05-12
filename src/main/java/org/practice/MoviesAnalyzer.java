package org.practice;


import org.practice.service.MemoryMoviesService;
import org.practice.service.MemoryUserService;

import java.util.*;

public class MoviesAnalyzer {

    private List<Movie> movies;
    private List<User> users;

    public MoviesAnalyzer(List<Movie> movies, List<User> users) {
        this.movies = movies;
        this.users = users;
    }

    public MoviesAnalyzer() {

    }

    public List<String> topWatchlistedMoviesAmongFriends(int userId) {


        MemoryUserService memoryUserService = new MemoryUserService();
        MemoryMoviesService memoryMoviesService = new MemoryMoviesService();


        List<Integer> friends = memoryUserService.getUserById(userId).orElseThrow(() -> new RuntimeException("Non matching user")).getFriends();

        List<Movie> movies = memoryMoviesService.getmList();



        Map<String, Integer> map = new HashMap<>();

        for (Movie movie : movies) {
            List<Integer> moviesWatchedBy = movie.getWatchlist();
            moviesWatchedBy.retainAll(friends);
            if (moviesWatchedBy.size() > 0) {
                map.put(movie.getTitle(), moviesWatchedBy.size());
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        //sorting the list elements
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<String> titlesOnly = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : list) {
            titlesOnly.add(entry.getKey());
        }
        if (titlesOnly.size() >= 4) {
            return titlesOnly.subList(0, 4);
        } else {
            return titlesOnly;
        }
    }
}
