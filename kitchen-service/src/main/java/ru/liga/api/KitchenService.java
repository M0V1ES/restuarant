package ru.liga.api;

import ru.liga.dto.Dish;

public interface KitchenService {
    Dish get();
    Dish create(Dish dish);
    Dish update(int id, Dish dish);
    Dish delete(int id);
}
