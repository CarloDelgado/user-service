package com.tutorial.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.userservice.entity.User;

@Repository

public interface UserRepository	extends JpaRepository<User, Integer>{

}
