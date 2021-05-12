package org.practice.service;

import org.practice.Movie;
import org.practice.MoviesAnalyzer;
import org.practice.User;

import java.util.Map.Entry;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        MoviesAnalyzer moviesAnalyzer = new MoviesAnalyzer();
        List<String> listOfTop = moviesAnalyzer.topWatchlistedMoviesAmongFriends(7001);

        for (String title : listOfTop
        ) {
            System.out.println(title);
        }
//        MemoryUserService memoryUserService = new MemoryUserService();
//        MemoryMoviesService memoryMoviesService = new MemoryMoviesService();
//
//
//        User user = memoryUserService.getUserById(7001).orElseThrow(() -> new RuntimeException("Non matching user"));
//        List<Integer> friends = user.getFriends();
//
//        List<Movie> movies = memoryMoviesService.getmList();
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (Movie movie : movies) {
//            List<Integer> moviesWatchedBy = movie.getWatchlist();
//            moviesWatchedBy.retainAll(friends);
//            if (moviesWatchedBy.size() > 0) {
//                map.put(movie.getTitle(), moviesWatchedBy.size());
//            }
//        }
//
//        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
//        //sorting the list elements
//        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//
//                return o2.getValue().compareTo(o1.getValue());
//
//            }
//        });
//        //prints the sorted HashMap
//        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//        for (Entry<String, Integer> entry : list) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }

    }
}
