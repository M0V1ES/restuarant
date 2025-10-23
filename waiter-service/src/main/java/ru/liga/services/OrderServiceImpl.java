package ru.liga.services;

import ru.liga.api.OrderService;
import ru.liga.dto.Order;
import ru.liga.dto.Status;

import java.util.ArrayList;
import java.util.Collections;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order get() {
        Order order = new Order();
		Status status = new Status();
		status.setId(1);
		status.setName("Готовится");
        order.setId(1);
        order.setDishes(new ArrayList<>(Collections.singleton("Салат цезарь")));
        order.setStatus(status.getName());
        return order;
    }

    @Override
    public Order delete(int id) {
        return new Order(id, new ArrayList<>(Collections.singleton("Удалено")) , "Удалено");
    }

    @Override
    public Order create(Order order) {
        if (order.getStatus().isEmpty() || order.getDishes().isEmpty()) {
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return order;
    }

    @Override
    public Order update(int id, Order order) {
        if (order.getStatus().isEmpty() || order.getDishes().isEmpty()) {
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return order;
    }
}
