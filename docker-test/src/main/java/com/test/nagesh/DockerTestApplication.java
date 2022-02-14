package com.test.nagesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class DockerTestApplication {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@GetMapping
	public List<Order> getOrders(){
	
		return orderRepo.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
