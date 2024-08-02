package com.alvesrezende.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesrezende.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
