package com.alvesrezende.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesrezende.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
