package org.practice;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String email;
    private ArrayList<Integer> friends;

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Integer> getFriends() {
        return friends;
    }

    public User(int userId, String email, ArrayList<Integer> friends) {
        this.userId = userId;
        this.email = email;
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", friends=" + friends +
                '}';
    }
}
