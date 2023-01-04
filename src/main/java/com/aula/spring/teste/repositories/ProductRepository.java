package com.aula.spring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
