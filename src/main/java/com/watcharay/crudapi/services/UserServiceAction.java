package com.watcharay.crudapi.services;

import com.watcharay.crudapi.entity.User;
import com.watcharay.crudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAction implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceAction(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String Id) {
        Optional<User> result = userRepository.findById(Id);
        User data = null;
        if (result.isPresent()) {
            data = result.get();
        }else{
            throw new RuntimeException("user not found");
        }
        return data;
    }

    @Override
    public void deleteById(String Id) {
        userRepository.deleteById(Id);
    }

}
