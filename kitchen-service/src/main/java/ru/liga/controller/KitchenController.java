package ru.liga.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;
import ru.liga.dto.Dish;
import ru.liga.dto.Status;
import ru.liga.feign.KitchenFeign;
import ru.liga.services.KitchenServiceImpl;

import java.util.Random;

@RestController
@RequestMapping("/kitchen")
@RequiredArgsConstructor
public class KitchenController {
    KitchenServiceImpl kitchenService;
    private final KitchenFeign kitchenFeign;

    @PutMapping("/status/{id}&{status}")
	String updateStatus(@PathVariable(name = "id") int id,@PathVariable(name = "status") String status){
        return kitchenFeign.updateStatus(id, status);
    }
    @GetMapping("/CanCook")
    public boolean CanCookTheOrder(){
        return new Random().nextBoolean();
    }

    @GetMapping("/")
    public Dish getMenu(){
        return kitchenService.get();
    }

    @DeleteMapping("/{id}")
    public Dish deleteMenu(@PathVariable int id){
        return kitchenService.delete(id);
    }

    @PostMapping
    public Dish createMenu(@RequestBody Dish dish){
        return kitchenService.create(dish);
    }

    @PutMapping("/{id}")
    public Dish updateMenu(@PathVariable int id, Dish dish){
        return kitchenService.update(id, dish);
    }

}
