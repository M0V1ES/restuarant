package ru.liga.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@FeignClient(value = "waiters-service", url="http://localhost:5006/waiters")
public interface KitchenFeign {

    @PutMapping("/order/{id}")
    Order updateOrder(@PathVariable int id, Order order);
}
