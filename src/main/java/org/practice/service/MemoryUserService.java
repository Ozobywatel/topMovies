package org.practice.service;

import org.practice.User;

import java.util.Optional;

public class MemoryUserService implements UserService{


    @Override
    public Optional<User> getUserById(int id) {
        return Optional.empty();
    }
}
