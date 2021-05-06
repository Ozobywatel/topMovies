package org.practice.service;

import org.practice.User;

public class Main {

    public static void main(String[] args) {

        MemoryUserService memoryUserService = new MemoryUserService();

        User user = memoryUserService.getUserById(7001).orElseThrow(()->new RuntimeException("Non matching user"));

        System.out.println(user);
    }
}
