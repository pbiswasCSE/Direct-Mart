package com.directmart.directmart.service;

import com.directmart.directmart.model.User;

public interface UserService {
    void saveUser(User user); // Save a new user
    boolean authenticate(String email, String password); // Authenticate user credentials
}
