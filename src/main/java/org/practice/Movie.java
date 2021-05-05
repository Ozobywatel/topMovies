package org.practice;

import java.util.List;

public class Movie {

    private String title;
    private String duration;
    private List<String> actors;
    private List<Rating> ratings;
    private List<Integer> favorites;
    private List<Integer> watchlist;


    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Integer> getFavorites() {
        return favorites;
    }

    public List<Integer> getWatchlist() {
        return watchlist;
    }

    public Movie(String title, String duration, List<String> actors, List<Rating> ratings, List<Integer> favorites, List<Integer> watchlist) {
        this.title = title;
        this.duration = duration;
        this.actors = actors;
        this.ratings = ratings;
        this.favorites = favorites;
        this.watchlist = watchlist;
    }
}
