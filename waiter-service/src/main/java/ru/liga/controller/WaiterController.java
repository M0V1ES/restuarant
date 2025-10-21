package ru.liga.controller;

import org.springframework.web.bind.annotation.*;
import ru.liga.dto.Menu;
import ru.liga.services.MenuServiceImpl;

@RestController
@RequestMapping("/waiters")
public class WaiterController {

	MenuServiceImpl waiterServiceImpl;

	@GetMapping("/")
	public Menu getMenu(){
		return waiterServiceImpl.get();
	}

	@DeleteMapping("/{id}")
	public Menu deleteMenu(@PathVariable int id){
		return waiterServiceImpl.delete(id);
	}

	@PostMapping
	public Menu create(@RequestBody Menu menu){
		return waiterServiceImpl.create(menu);
	}

	@PutMapping("/{id}")
	public Menu update(@PathVariable int id, Menu menu){
		return waiterServiceImpl.update(id, menu);
	}

}
