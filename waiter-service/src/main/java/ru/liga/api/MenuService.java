package ru.liga.api;

import ru.liga.dto.Menu;

public interface MenuService {
	Menu get();
	Menu delete(int id);
	Menu create(Menu menu);
	Menu update(int id, Menu menu);
}
