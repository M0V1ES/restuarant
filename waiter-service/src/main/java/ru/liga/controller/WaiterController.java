package ru.liga.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.liga.dto.Menu;
import ru.liga.dto.Order;
import ru.liga.dto.Status;
import ru.liga.feign.WaiterFeign;
import ru.liga.services.MenuServiceImpl;
import ru.liga.services.OrderServiceImpl;
import ru.liga.services.StatusServiceImpl;

@RestController
@RequestMapping("/waiters")
@RequiredArgsConstructor
public class WaiterController {

	MenuServiceImpl waiterServiceImpl;
    OrderServiceImpl orderServiceImpl;
    private final WaiterFeign waiterFeign;
	StatusServiceImpl statusServiceImpl;

	@PutMapping("/status/{id}&{status}")
	public String updateStatus(@PathVariable(name = "id") int id, @PathVariable(name = "status")String status){
		return status;
	}

    @GetMapping("/CanCook")
    public boolean CanCookKitchen(){
        return waiterFeign.CanCookTheOrder();
    }

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

    @PutMapping("/order/status/{id}")
    public Order updateStatus(@PathVariable int id, Order order){
        return orderServiceImpl.update(id, order);
    }


}
