package com.alvesrezende.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesrezende.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
