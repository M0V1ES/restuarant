package ru.liga.services;

import ru.liga.api.OrderService;
import ru.liga.dto.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrderServiceImpl implements OrderService {

    @Override
    public Order get() {
        Order order = new Order();
        order.setId(new Random().nextInt());
        order.setDishes(new ArrayList<>(Collections.singleton(String.valueOf(new Random().nextInt()))));
        order.setStatus(String.valueOf(new Random().nextInt()));
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
