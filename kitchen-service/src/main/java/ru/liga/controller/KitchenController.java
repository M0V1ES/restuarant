package ru.liga.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;
import ru.liga.dto.Dish;
import ru.liga.feign.KitchenFeign;
import ru.liga.services.KitchenServiceImpl;

import java.util.Random;

@RestController
@RequestMapping("/kitchen")
@RequiredArgsConstructor
public class KitchenController {
    KitchenServiceImpl kitchenService;
    KitchenFeign kitchenFeign;

    @PutMapping("/order/{id}")
    Order updateOrder(@PathVariable int id, Order order){
        return kitchenFeign.updateOrder(id, order);
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
