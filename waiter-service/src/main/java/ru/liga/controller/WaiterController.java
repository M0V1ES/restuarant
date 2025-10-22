package ru.liga.controller;

import org.springframework.web.bind.annotation.*;
import ru.liga.dto.Menu;
import ru.liga.dto.Order;
import ru.liga.services.MenuServiceImpl;
import ru.liga.services.OrderServiceImpl;

@RestController
@RequestMapping("/waiters")
public class WaiterController {

	MenuServiceImpl waiterServiceImpl;
    OrderServiceImpl orderServiceImpl;

	@GetMapping("/")
	public Menu getMenu(){
		return waiterServiceImpl.get();
	}

	@DeleteMapping("/{id}")
	public Menu deleteMenu(@PathVariable int id){
		return waiterServiceImpl.delete(id);
	}

	@PostMapping
	public Menu createMenu(@RequestBody Menu menu){
		return waiterServiceImpl.create(menu);
	}

    @PutMapping("/{id}")
    public Menu updateMenu(@PathVariable int id, Menu menu){
        return waiterServiceImpl.update(id, menu);
    }

    @GetMapping("/order/")
    public Order getOrder(){
        return orderServiceImpl.get();
    }

    @DeleteMapping("/order/{id}")
    public Order deleteOrder(@PathVariable int id){
        return orderServiceImpl.delete(id);
    }

    @PostMapping(value = "/order/")
    public Order createOrder(@RequestBody Order order){
        return orderServiceImpl.create(order);
    }

    @PutMapping("/order/{id}")
    public Order updateOrder(@PathVariable int id, Order order){
        return orderServiceImpl.update(id, order);
    }

}
