package com.example.paulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paulo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
