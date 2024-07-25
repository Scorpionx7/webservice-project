package com.alvesrezende.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesrezende.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
