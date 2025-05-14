package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo implements FakeRepoInterface {
    private List<User> users = new ArrayList<>();

    @Override
    public String insertUser(long id, String name, String surname) {
        users.add(new User(id, name, surname));
        return name;
    }

    @Override
    public User findUserById(long id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
