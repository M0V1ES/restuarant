package ru.liga.services;

import ru.liga.api.KitchenService;
import ru.liga.dto.Dish;

import java.util.ArrayList;
import java.util.Collections;

public class KitchenServiceImpl implements KitchenService {

    @Override
    public Dish get() {
        Dish dish = new Dish();
        dish.setId(1);
        dish.setName("Тестовое");
        dish.setIngredients(new ArrayList<>(Collections.singleton("Тестовый ингридиент")));
        dish.setCookingTime(120);
        return dish;
    }

    @Override
    public Dish create(Dish dish) {
        if (dish.getName().isEmpty() || dish.getIngredients().isEmpty() || dish.getCookingTime() != 0){
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return dish;
    }

    @Override
    public Dish update(int id, Dish dish) {
        if (dish.getName().isEmpty() || dish.getIngredients().isEmpty() || dish.getCookingTime() != 0){
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return dish;
    }

    @Override
    public Dish delete(int id) {
        return new Dish(id,"Удалено",new ArrayList<>(Collections.singleton("Удалено")),0);
    }
}
