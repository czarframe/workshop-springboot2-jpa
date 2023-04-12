package com.estudosspring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudosspring.curso.entities.OrderItem;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
    
}
