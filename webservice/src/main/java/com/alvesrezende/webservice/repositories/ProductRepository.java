package com.alvesrezende.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesrezende.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
