package org.practice.service;

import org.practice.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(int id);
}
