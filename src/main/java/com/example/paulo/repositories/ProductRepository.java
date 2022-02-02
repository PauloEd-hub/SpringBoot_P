package com.example.paulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paulo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
