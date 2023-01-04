package com.aula.spring.teste.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aula.spring.teste.entities.Order;
import com.aula.spring.teste.entities.User;
import com.aula.spring.teste.repositories.OrderRepository;
import com.aula.spring.teste.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Igor Ribeiro", "igor@gmail.com", "8888-8888", "123456"); 
		User u2 = new User(null, "Mirna Helena", "mirna@gmail.com", "9999-9999", "789456"); 
	
		Order o1 = new Order(null, Instant.parse("2023-06-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2023-07-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2023-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
}
