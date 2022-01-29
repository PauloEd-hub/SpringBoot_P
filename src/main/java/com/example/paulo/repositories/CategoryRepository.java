package com.example.paulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paulo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
