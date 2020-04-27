package com.example.demo.servicetwo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {

	@Autowired
	private ServiceOneData serviceOne;
    
	@GetMapping("/item")
	public Item getData() {		
		return serviceOne.getItemByName().getBody();
	}
	
	@GetMapping("/items")
	public Collection<Item> getItems() {
		return serviceOne.getItemsabc();
	}

}