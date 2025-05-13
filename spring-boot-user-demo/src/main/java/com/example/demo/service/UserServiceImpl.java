package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface repo;
    private static long counter = 1;

    @Autowired
    public UserServiceImpl(FakeRepoInterface repo) {
        this.repo = repo;
    }

    @Override
    public void addUser(String name, String surname) {
        long id = counter++;
        repo.insertUser(id, name, surname);
        System.out.println(name + " added with ID: " + id);
    }

    @Override
    public void removeUser(long id) {
        String name = repo.deleteUser(id);
        if (name != null) {
            System.out.println(name + " removed");
        } else {
            System.out.println("User not found");
        }
    }

    @Override
    public void getUser(long id) {
        User user = repo.findUserById(id);
        if (user != null) {
            System.out.println("hello " + user.getName());
        } else {
            System.out.println("User not found");
        }
    }
}
