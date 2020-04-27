package coma.example.serviceone;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	public Item findItemByName(String name){		
		return new Item(name);
	}
	
	public Collection<Item> findAll(){
		Collection<Item> items = new ArrayList<Item>();
		items.add(new Item("ITEM 1"));
		items.add(new Item("ITEM 2"));
		items.add(new Item("ITEM 3"));
		items.add(new Item("ITEM 4"));
		items.add(new Item("ITEM 5"));
		return items;
	}		
		
}
