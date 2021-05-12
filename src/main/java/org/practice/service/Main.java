package org.practice.service;

import org.practice.Movie;
import org.practice.MoviesAnalyzer;
import org.practice.User;

import java.util.Map.Entry;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        MoviesAnalyzer moviesAnalyzer = new MoviesAnalyzer();
        List<String> listOfTop = moviesAnalyzer.topWatchlistedMoviesAmongFriends(62289);

        for (String title : listOfTop
        ) {
            System.out.println(title);
        }

    }
}
