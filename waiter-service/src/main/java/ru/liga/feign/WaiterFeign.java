package ru.liga.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "kitchen-service", url="http://localhost:8080/kitchen")
public interface WaiterFeign {
    @GetMapping("/CanCook")
    boolean CanCookTheOrder();

}
