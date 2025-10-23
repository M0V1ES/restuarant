package ru.liga.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "waiters-service", url="http://localhost:5006/waiters")
public interface KitchenFeign {
	@PutMapping("/status/{id}&{status}")
	String updateStatus(@PathVariable(name = "id")int id,@PathVariable(name = "status") String string);

}
