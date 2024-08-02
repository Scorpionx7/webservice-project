package com.alvesrezende.webservice.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alvesrezende.webservice.entities.Order;
import com.alvesrezende.webservice.entities.User;
import com.alvesrezende.webservice.entities.enums.OrderStatus;
import com.alvesrezende.webservice.repositories.OrderRepository;
import com.alvesrezende.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner  {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Esther Rezende", "estherrezende@gmail,com", "73982468553", "123456");
		User u2 = new User(null, "Saulo Rezende", "saulorezende@gmail.com", "73981856912", "987654");
		
		Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	

}
