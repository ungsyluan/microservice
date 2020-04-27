package coma.example.serviceone;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {	
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public Collection<Item> findItems() {
		return itemService.findAll();
	}
	
	@GetMapping("/item")
	public ResponseEntity<Item> findItemById() {
		return ResponseEntity.ok(itemService.findItemByName("OK BAY BE"));
	}

}