package com.watcharay.crudapi.services;

import com.watcharay.crudapi.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(String Id);
    void deleteById(String Id);
}
