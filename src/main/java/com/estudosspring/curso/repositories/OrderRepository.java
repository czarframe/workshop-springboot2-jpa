package com.estudosspring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudosspring.curso.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
