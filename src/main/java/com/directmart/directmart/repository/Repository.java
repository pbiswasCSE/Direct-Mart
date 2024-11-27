package com.directmart.directmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.directmart.directmart.model.User;

public interface Repository extends JpaRepository<User,Integer> {
    

}
