package com.aula.spring.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.spring.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
