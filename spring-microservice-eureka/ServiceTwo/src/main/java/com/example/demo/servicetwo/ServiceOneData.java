package com.example.demo.servicetwo;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("serviceone")
public interface ServiceOneData {
	
	@GetMapping("/item")
	ResponseEntity<Item> getItemByName();
	
	@GetMapping("/items")
	Collection<Item> getItemsabc();
}
