package com.example.paulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paulo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
