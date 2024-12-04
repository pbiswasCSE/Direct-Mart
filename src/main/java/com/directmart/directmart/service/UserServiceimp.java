package com.directmart.directmart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.directmart.directmart.model.User;
import com.directmart.directmart.repository.UserRepository;

@Service
public class UserServiceimp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        // Check if email already exists
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already exists!");
        }

        // Save user to the database
        userRepository.save(user);
    }

    @Override
    public boolean authenticate(String email, String password) {
        // Check if user exists and validate password
        return userRepository.findByEmail(email)
                .map(existingUser -> existingUser.getPassword().equals(password))
                .orElse(false);
    }
}
