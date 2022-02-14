package com.test.nagesh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepo {

	public List<Order> getOrders() {

		return Stream.of(new Order(1, "Laptop", 13, 10000), new Order(2, "Printers", 10, 20000),
				new Order(1, "Mobiles", 25, 20000)).collect(Collectors.toList());
	}
}
