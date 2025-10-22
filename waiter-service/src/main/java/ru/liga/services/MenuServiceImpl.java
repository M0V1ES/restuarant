package ru.liga.services;

import org.springframework.stereotype.Service;
import ru.liga.api.MenuService;
import ru.liga.dto.Menu;
import java.util.Random;

@Service
public class MenuServiceImpl implements MenuService {

    @Override
    public Menu get() {
        Menu menu = new Menu();
        menu.setId(new Random().nextInt());
        menu.setName("Меню");
        menu.setPrice(new Random().nextFloat());
        return menu;
    }

    @Override
    public Menu delete(int id) {
        return new Menu(id, "Удаленное меню", 0);
    }

    @Override
    public Menu create(Menu menu) {
        if (menu.getName().isEmpty() || menu.getPrice() < 0) {
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return menu;
    }

    @Override
    public Menu update(int id, Menu menu) {
        if (menu.getName().isEmpty() || menu.getPrice() < 0) {
            throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
        }
        return menu;
    }
}
