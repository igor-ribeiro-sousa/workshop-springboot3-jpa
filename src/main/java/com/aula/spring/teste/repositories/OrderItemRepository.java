package com.aula.spring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
