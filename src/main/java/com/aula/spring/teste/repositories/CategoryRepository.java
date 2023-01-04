package com.aula.spring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
