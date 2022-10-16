package com.estudosspring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosspring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
