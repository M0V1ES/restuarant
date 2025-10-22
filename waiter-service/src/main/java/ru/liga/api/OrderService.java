package ru.liga.api;

import ru.liga.dto.Order;

public interface OrderService {
    Order get();
    Order delete(int id);
    Order create(Order Order);
    Order update(int id, Order Order);
}
