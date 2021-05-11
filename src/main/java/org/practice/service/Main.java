package org.practice.service;

import org.practice.Movie;
import org.practice.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MemoryUserService memoryUserService = new MemoryUserService();
        MemoryMoviesService memoryMoviesService = new MemoryMoviesService();


        User user = memoryUserService.getUserById(7001).orElseThrow(()->new RuntimeException("Non matching user"));
        List<Integer> friends = user.getFriends();

        List<Movie> movies = memoryMoviesService.getmList();

        for (Movie movie: movies) {
            List<Integer> moviesWatchedBy = movie.getWatchlist();
            moviesWatchedBy.retainAll( friends );
            for (Integer friendsId :
                    moviesWatchedBy) {
                System.out.println(friendsId);
            }
        }

    }
}
