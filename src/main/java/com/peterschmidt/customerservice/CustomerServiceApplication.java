package com.peterschmidt.customerservice;

import com.peterschmidt.customerservice.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/customer")

public class CustomerServiceApplication {

	@RequestMapping("/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int id){
		return new Customer(id,"Max", "Mustermann", "max@mustermann.com");
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

}
