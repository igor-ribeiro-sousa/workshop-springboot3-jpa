package com.aula.spring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
